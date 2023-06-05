package com.example.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice.databinding.ActivityEditNickNameBinding

class EditNickNameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditNickNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditNickNameBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}