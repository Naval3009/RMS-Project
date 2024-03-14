package com.example.rms_project.viewmodel

import androidx.lifecycle.ViewModel
import com.bumptech.glide.load.engine.Resource
import com.example.rms_project.data.User
import com.example.rms_project.utils.Recource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class LoginRegisterViewModel @Inject constructor(private val firebaseAuth:FirebaseAuth): ViewModel()
{
    private val _register= MutableStateFlow<Resource<FirebaseUser>>(Recource.Loading())
    fun createAccoutWithEmailAndPassword(user: User, password:String)
    {
        firebaseAuth.createUserWithEmailAndPassword(user.email,password)
            .addOnSuccessListener {
                it.user?.let { _register.value= Recource.Success(it) }
            }
            .addOnFailureListener{
                _register.value= Recource.Error(it.message.toString())
            }

    }

}
