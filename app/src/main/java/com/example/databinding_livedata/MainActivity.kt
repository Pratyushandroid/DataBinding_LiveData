package com.example.databinding_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.databinding_livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModal: MainViewModal
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
       mainViewModal = ViewModelProvider(this)[MainViewModal::class.java]

        val quoteobj = Quote("I am cool Dude","PP","https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80")
        binding.quote = quoteobj
//        mainViewModal.quotedata.observe(this, Observer {
//           binding.text.text = it
//        })
        binding.lifecycleOwner = this
//        binding.btnclick.setOnClickListener {
//          mainViewModal.update()
//        }
        binding.viewmodel = mainViewModal
    }


}