package com.example.intentpractice

import android.app.Activity
import android.content.Intent
import android.net.Uri
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

        //call 버튼 기능
        binding.callBtn.setOnClickListener {
            val inputPhoneNum = binding.phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${inputPhoneNum}")

            val myIntent = Intent(Intent.ACTION_CALL,myUri)

            startActivity(myIntent)

        }

        //전화연결 기능
        binding.dialBtn.setOnClickListener{
            //phoneNumEdt에 입력한 전화번호를 받아서>>> 해당 번호에 전화 연결
            val inputPhoneNum = binding.phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${inputPhoneNum}")

            val myIntent = Intent(Intent.ACTION_DIAL,myUri)

            startActivity(myIntent)
        }

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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //돌아온 이유가 닉네임을 받으로 온게 맞나?
        if (requestCode == REQUEST_FOR_NICKNAME){
            //확인 버튼을 눌러서 온게 맞는가?
            if(resultCode == Activity.RESULT_OK){
                //닉네임 데이타 꺼내서 반영하기
                val newNickname = data?.getStringExtra("nickname")
                binding.nicknameTxt.text =  newNickname
            }
        }

    }
}