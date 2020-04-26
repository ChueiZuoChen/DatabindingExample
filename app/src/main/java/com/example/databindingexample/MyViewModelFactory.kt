package com.example.databindingexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MyViewModelFactory : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MyViewModel::class.java)){
            return MyViewModel() as T
        }
        throw IllegalAccessException("Unknow view model class.")
    }

}