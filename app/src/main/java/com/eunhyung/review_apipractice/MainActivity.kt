package com.eunhyung.review_apipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

//            입력한 이메일 / 비번 변수에 저장
            val inputEmail = edtEmail.text.toString()
            val inputPw = edtPassword.text.toString()

//            서버 API의 로그인 기능에 활용

        }
    }
}