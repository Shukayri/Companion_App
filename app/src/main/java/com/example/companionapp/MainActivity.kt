package com.example.companionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var tv: TextView
    lateinit var statusEd: EditText
    lateinit var layout: ConstraintLayout
    lateinit var statusBthChange: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(Constant.MAIN_TAG, "onCreate: ")

        tv = findViewById(R.id.tv)
        layout = findViewById(R.id.layout)
        statusEd = findViewById(R.id.statusEd)
        statusBthChange = findViewById(R.id.statusChangeBth)


        statusBthChange.setOnClickListener {
            var dayOrNightStr = statusEd.text?.toString()
            when (dayOrNightStr?.lowercase(Locale.getDefault())) {
                "day" -> {
                    val time = Status()
                    time.changeBackground(layout, Status.day)
                    statusEd.setTextColor(Color.BLACK)
                    tv.setTextColor(Color.BLACK)
                }
                "night" -> {
                    val time = Status()
                    time.changeBackground(layout, Status.night)
                    statusEd.setTextColor(Color.WHITE)
                    tv.setTextColor(Color.WHITE)
                }
            }
        }


    }
}