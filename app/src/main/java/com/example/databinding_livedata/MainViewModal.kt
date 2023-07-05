package com.example.databinding_livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModal:ViewModel() {

    val quotedata =  MutableLiveData<String>("Hello")

            fun update(){
                quotedata.value = "I am Pratyush Jii"
            }

}