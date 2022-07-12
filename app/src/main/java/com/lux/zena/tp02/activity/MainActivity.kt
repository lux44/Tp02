package com.lux.zena.tp02.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lux.zena.tp02.R
import com.lux.zena.tp02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val ci:String = "asdf1234"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            loadPw()


        }
    }

    private fun loadPw(){

    }
}