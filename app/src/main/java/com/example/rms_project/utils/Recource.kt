package com.example.rms_project.utils

import com.bumptech.glide.load.engine.Resource
import com.google.firebase.auth.FirebaseUser

sealed class Recource<T>(
    val data:T?=null,
    val message:String?=null
) {
    class Success<T>(data:T):Recource<T>(data), Resource<FirebaseUser> {
        override fun getResourceClass(): Class<FirebaseUser> {
            TODO("Not yet implemented")
        }

        override fun get(): FirebaseUser {
            TODO("Not yet implemented")
        }

        override fun getSize(): Int {
            TODO("Not yet implemented")
        }

        override fun recycle() {
            TODO("Not yet implemented")
        }
    }

    class Error<T>(message: String): Resource<T>
    {
        override fun getResourceClass(): Class<T> {
            TODO("Not yet implemented")
        }

        override fun get(): T & Any {
            TODO("Not yet implemented")
        }

        override fun getSize(): Int {
            TODO("Not yet implemented")
        }

        override fun recycle() {
            TODO("Not yet implemented")
        }

    }
    class Loading <T>: Resource<T> {
        override fun getResourceClass(): Class<T> {
            TODO("Not yet implemented")
        }

        override fun get(): T & Any {
            TODO("Not yet implemented")
        }

        override fun getSize(): Int {
            TODO("Not yet implemented")
        }

        override fun recycle() {
            TODO("Not yet implemented")
        }
    }


}
