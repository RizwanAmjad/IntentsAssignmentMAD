package com.rizwanamjadnov.intentsassignmentmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnTimer:Button
    private lateinit var btnAlarm:Button
    private lateinit var btnCamera:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTimer = findViewById(R.id.btn_menu_timer)
        btnAlarm = findViewById(R.id.btn_menu_alarm)
        btnCamera = findViewById(R.id.btn_menu_camera)

        btnTimer.setOnClickListener {
            val intent = Intent(this, TimerIntentActivity::class.java)
            startActivity(intent)
        }

        btnAlarm.setOnClickListener {
            val intent = Intent(this, AlarmIntentActivity::class.java)
            startActivity(intent)
        }

        btnCamera.setOnClickListener {
            val intent = Intent(this, CameraIntentActivity::class.java)
            startActivity(intent)
        }
    }
}