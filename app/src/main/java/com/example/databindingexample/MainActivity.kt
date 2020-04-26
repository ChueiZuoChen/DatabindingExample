package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.databindingexample.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this, MyViewModelFactory()).get(MyViewModel::class.java)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this
        viewModel.newInput.observe(this, Observer {
            Log.d("tag", "newinput =$it")
        })
        viewModel.input2.observe(this, Observer {
            Log.d("tag", "Input2 = $it")
        })


    }
}
