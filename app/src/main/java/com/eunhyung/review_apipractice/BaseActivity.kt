package com.eunhyung.review_apipractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eunhyung.review_apipractice.api.APIList
import com.eunhyung.review_apipractice.api.ServerAPI
import retrofit2.Retrofit

abstract class BaseActivity : AppCompatActivity() {

    lateinit var retrofit : Retrofit
    lateinit var apiList : APIList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        이 내부의 코드는 모든 화면들의 시작지점에서 공통적으로 실행되는 코드

//        레트로핏 관련 설정들을 여기서 진행 => 모든 화면들이 자동 실행

        retrofit = ServerAPI.getRetrofit()
        apiList = retrofit.create(APIList::class.java)

    }
}