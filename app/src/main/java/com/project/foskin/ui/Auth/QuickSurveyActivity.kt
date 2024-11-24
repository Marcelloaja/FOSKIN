package com.project.foskin.ui.Auth

import android.content.Intent
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.project.foskin.MainActivity
import com.project.foskin.R

class QuickSurveyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quick_survey)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val survey1Button: FrameLayout = findViewById(R.id.survey1)
        survey1Button.setOnClickListener {
            Toast.makeText(this, "Survey 1 clicked!", Toast.LENGTH_SHORT).show()
            val background = survey1Button.background as GradientDrawable

            background.setColor(getColor(R.color.gold))

            survey1Button.postDelayed({
                background.setColor(getColor(R.color.white))
            }, 200)

            val survey2Button: FrameLayout = findViewById(R.id.survey2)
            survey2Button.setOnClickListener {
                Toast.makeText(this, "Survey 2 clicked!", Toast.LENGTH_SHORT).show()
                val background = survey2Button.background as GradientDrawable

                background.setColor(getColor(R.color.gold))

                survey2Button.postDelayed({
                    background.setColor(getColor(R.color.white))
                }, 200)
            }

            val survey3Button: FrameLayout = findViewById(R.id.survey3)
            survey3Button.setOnClickListener {
                Toast.makeText(this, "Survey 3 clicked!", Toast.LENGTH_SHORT).show()
                val background = survey3Button.background as GradientDrawable

                background.setColor(getColor(R.color.gold))

                survey3Button.postDelayed({
                    background.setColor(getColor(R.color.white))
                }, 200)
            }

            val survey4Button: FrameLayout = findViewById(R.id.survey4)
            survey4Button.setOnClickListener {
                Toast.makeText(this, "Survey 4 clicked!", Toast.LENGTH_SHORT).show()
                val background = survey4Button.background as GradientDrawable

                background.setColor(getColor(R.color.gold))

                survey4Button.postDelayed({
                    background.setColor(getColor(R.color.white))
                }, 200)
            }
        }

        val btn_finish = findViewById<Button>(R.id.btn_finish)

        btn_finish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        // Function for Age
        val iconMinus = findViewById<ImageView>(R.id.icon_minus)
        val iconPlus = findViewById<ImageView>(R.id.icon_plus)
        val numberText = findViewById<TextView>(R.id.age_text)

        var number = 0
        numberText.text = number.toString()

        iconMinus.setOnClickListener {
            if (number > 0) {
                number--
                numberText.text = number.toString()
            }
        }

        iconPlus.setOnClickListener {
            number++
            numberText.text = number.toString()
        }
    }
}