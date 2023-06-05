package com.example.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice.databinding.ActivityMainBinding
import com.example.intentpractice.databinding.ActivityOtherBinding

class OtherActivity : AppCompatActivity() {
    private lateinit var binding : ActivityOtherBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtherBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.returnToMainBtn.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }

    }
}