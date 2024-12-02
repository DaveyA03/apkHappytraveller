package com.example.loginhappytraveller.ui.presentation.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.loginhappytraveller.ui.domain.usecase.AuthUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel

class HomeViewModel @Inject constructor(private val authUseCase: AuthUseCase):ViewModel() {

     var email=authUseCase.getCurrentUser()?.email

     fun logout(){
          authUseCase.logout()
     }
}