package com.example.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.moveToOtherBtn.setOnClickListener {
            //다른 화면으로 이동
            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)


        }
    }
}