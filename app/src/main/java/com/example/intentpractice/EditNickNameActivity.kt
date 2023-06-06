package com.example.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice.databinding.ActivityEditNickNameBinding

class EditNickNameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditNickNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditNickNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.okBtn.setOnClickListener {

            //닉네임 입력창 정보 가져오기
            val inputNewNickname = binding.newNicknameEdt.text.toString()

            //입력닉네임을 담아주기 위한 용도로 인텐트를 만든다
            val resultIntent = Intent()
            resultIntent.putExtra("nickname",inputNewNickname)
            setResult(RESULT_OK,resultIntent)
            finish()

        }
    }
}