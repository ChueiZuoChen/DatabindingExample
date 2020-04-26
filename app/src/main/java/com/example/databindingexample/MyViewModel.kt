package com.example.databindingexample

import android.widget.EditText
import androidx.databinding.*
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel(),Observable{
    @Bindable
    val input = MutableLiveData<String>()
    val newInput:LiveData<String>
    get() = input

    fun onClickButton(){
        input.value = newInput.value.plus("123")
    }


    @Bindable
    val input2 = MutableLiveData<String>("0")
    private val newInput2:LiveData<String>
    get() = input2

    fun onClickButton2(){
        val number = newInput2.value?.toInt()
        input2.value = number?.plus(1).toString()
    }




    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }
}