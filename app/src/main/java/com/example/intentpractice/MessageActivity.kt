package com.example.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice.databinding.ActivityMessageBinding

class MessageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //이 화면에 들어올때 첨부된 데이터를 반영하기
        val intentMessage = intent.getStringExtra("message")

        binding.receivedMessageTxt.text = intentMessage


    }
}