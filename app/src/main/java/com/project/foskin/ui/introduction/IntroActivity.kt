package com.project.foskin.ui.introduction

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.content.ContextCompat
import com.project.foskin.MainActivity
import com.project.foskin.R

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intro)
        supportActionBar?.hide()

        val motionLayout = findViewById<MotionLayout>(R.id.main)

        val btnNext1 = findViewById<Button>(R.id.btnNext)
        val btnNext2 = findViewById<Button>(R.id.btnNext2)
        val btnStarted = findViewById<Button>(R.id.btnStarted)

        btnNext1.setOnClickListener {
            motionLayout.transitionToEnd()
        }

        btnNext2.setOnClickListener {
            motionLayout.setTransition(R.id.menu2, R.id.menu3)
            motionLayout.transitionToEnd()
        }

        btnStarted.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
