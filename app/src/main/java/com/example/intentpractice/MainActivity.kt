package com.example.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val REQUEST_FOR_NICKNAME = 1005
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //닉네임 변경관련
        binding.editNicknameBtn.setOnClickListener {
            //다른창에 있는 데이타를 받으러 갔다 오는  intent
            val myIntent = Intent(this,EditNickNameActivity::class.java)
            startActivityForResult(myIntent,REQUEST_FOR_NICKNAME)
        }

        //데이타 담아서 전달하기
        binding.sendMessageBtn.setOnClickListener {
            val inputMessage = binding.messageEdt.text.toString()
            val myIntent = Intent(this,MessageActivity::class.java)

            myIntent.putExtra("message",inputMessage)

            startActivity(myIntent)
        }

        binding.moveToOtherBtn.setOnClickListener {
            //다른 화면으로 이동
            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)


        }
    }
}