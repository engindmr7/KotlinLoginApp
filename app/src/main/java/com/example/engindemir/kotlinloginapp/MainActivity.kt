package com.example.engindemir.kotlinloginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view : View){

        val string = editUser.text.toString()

        if(view.id == R.id.buttonlogin){

            val intent= Intent(this@MainActivity,Disp::class.java)
            intent.putExtra("Username",string)
            startActivity(intent)


        }


    }




}
