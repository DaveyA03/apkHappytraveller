package com.example.loginhappytraveller.ui.domain.repository

import com.example.loginhappytraveller.ui.domain.model.DataResponse
import com.google.firebase.auth.FirebaseUser

interface AuthRepository {
    val currentUser:FirebaseUser?
    suspend fun login(email:String,password:String):DataResponse<FirebaseUser>
    suspend fun register(email: String,password: String):DataResponse<FirebaseUser>
    fun logout()
}