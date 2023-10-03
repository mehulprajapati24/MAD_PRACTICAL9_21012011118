package com.example.mad_practical9_21012011118

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var logoImg: ImageView = findViewById(R.id.uvpceLogo)
        //logoImg.setImageResource(R.drawable.uvpce_logo_1)
        var animationDrawable: AnimationDrawable = logoImg.background as AnimationDrawable
        animationDrawable.start()
    }
}