package com.example.loginhappytraveller.ui.domain.usecase

import com.example.loginhappytraveller.ui.domain.repository.AuthRepository
import javax.inject.Inject

class GetCurrentUser @Inject constructor(private val repository: AuthRepository) {
  operator fun invoke()=repository.currentUser
}