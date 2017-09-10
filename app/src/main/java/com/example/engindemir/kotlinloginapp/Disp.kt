package com.example.engindemir.kotlinloginapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


import kotlinx.android.synthetic.main.activity_disp.*

class Disp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disp)

        val user = intent.getStringExtra("Username")
        textgelen.text=user


    }
}
