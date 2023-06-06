package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
//import com.example.splashscreen.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this,ClosedRange ::class.java)
            startActivity(intent)
            finish()
        },5000)


    }

}
