package com.example.servicebasic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.servicebasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            buttonStart.setOnClickListener{
                startService(Intent(this@MainActivity, MyService::class.java))
            }

            buttonStop.setOnClickListener {
                stopService(Intent(this@MainActivity, MyService::class.java))
            }
        }

    }
}