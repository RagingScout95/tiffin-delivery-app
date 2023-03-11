package com.example.tiffindeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window



class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        Handler().postDelayed(Runnable {
            val intent = Intent(splashScreen@this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },1000)
    }
}
