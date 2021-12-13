package com.rizwanamjadnov.intentsassignmentmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnTimer:Button
    private lateinit var btnAlarm:Button
    private lateinit var btnCamera:Button
    private lateinit var button_cont:Button
    private lateinit var button_map:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTimer = findViewById(R.id.btn_menu_timer)
        btnAlarm = findViewById(R.id.btn_menu_alarm)
        btnCamera = findViewById(R.id.btn_menu_camera)
        button_cont=findViewById(R.id.button_contact)
        button_map=findViewById(R.id.button2)

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
        button_cont.setOnClickListener {
            val intent = Intent(this, add_contactActivity::class.java)
            startActivity(intent)
        }

        button_map.setOnClickListener{
            val intent =Intent(this, Open_Map::class.java)
            startActivity(intent)
        }
    }
}