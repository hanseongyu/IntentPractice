package com.example.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice.databinding.ActivityMainBinding
import com.example.intentpractice.databinding.ActivityOtherBinding

class OtherActivity : AppCompatActivity() {
    private lateinit val binding : ActivityOtherBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtherBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_other)

        binding.returnToMainBtn.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }

    }
}