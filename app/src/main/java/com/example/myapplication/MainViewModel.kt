package com.example.myapplication

import androidx.lifecycle.ViewModel

class MainViewModel(initialValue: Int): ViewModel() {

    var count: Int = initialValue


    fun increment(){
        count++
    }
}