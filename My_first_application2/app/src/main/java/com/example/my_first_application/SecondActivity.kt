package com.example.my_first_application

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val Bundle: Bundle ? = intent.extras
        val msg = Bundle!!.getString("user_message")


        txvusermessage.text = msg
    }
}