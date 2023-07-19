package com.shivani.fragmentcontainertask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shivani.fragmentcontainertask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var a = 0
    var b = 10
    lateinit var binding : ActivityMainBinding
    var activityClickInterface : ActivityClickInterface?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvChangeFragment.setOnClickListener{
            a++
            activityClickInterface?.ActivityClick(a)
        }
        binding.tvChangevalue.setOnClickListener {
            b--
            activityClickInterface?.ActivityClick(b)
        }
    }
    fun changeText(text : String){
        binding.tvName.setText(text)

    }
}