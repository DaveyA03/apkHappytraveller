package com.example.loginhappytraveller.ui.domain.usecase

import com.example.loginhappytraveller.ui.domain.repository.AuthRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor( private val repository: AuthRepository)  {
    suspend operator fun invoke(email:String,password:String)=repository.login(email, password)
}