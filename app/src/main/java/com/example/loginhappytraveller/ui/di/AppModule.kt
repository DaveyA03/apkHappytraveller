package com.example.loginhappytraveller.ui.di

import com.example.loginhappytraveller.ui.data.AuthRepositoryImpl
import com.example.loginhappytraveller.ui.domain.repository.AuthRepository
import com.example.loginhappytraveller.ui.domain.usecase.AuthUseCase
import com.example.loginhappytraveller.ui.domain.usecase.GetCurrentUser
import com.example.loginhappytraveller.ui.domain.usecase.LoginUseCase
import com.example.loginhappytraveller.ui.domain.usecase.Logout
import com.example.loginhappytraveller.ui.domain.usecase.RegisterUseCase
import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideFirebaseAuth()=FirebaseAuth.getInstance()

    @Provides
    fun provideAuthRepository(impl:AuthRepositoryImpl):AuthRepository=impl

    @Provides
    fun provideAuthUseCase(repository: AuthRepository)=AuthUseCase(
        loginUseCase = LoginUseCase(repository),
        logout = Logout(repository),
        registerUseCase = RegisterUseCase(repository),
        getCurrentUser = GetCurrentUser(repository)
    )

}