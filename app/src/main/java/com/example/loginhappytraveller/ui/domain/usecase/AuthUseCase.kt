package com.example.loginhappytraveller.ui.domain.usecase

data class AuthUseCase(
    val getCurrentUser: GetCurrentUser,
   val loginUseCase: LoginUseCase,
  val registerUseCase: RegisterUseCase,
    val logout: Logout
)
