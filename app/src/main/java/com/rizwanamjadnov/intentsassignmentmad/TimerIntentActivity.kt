package com.rizwanamjadnov.intentsassignmentmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText

class TimerIntentActivity : AppCompatActivity() {
    private lateinit var edtTimer:EditText
    private lateinit var btnTimer:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer_intent)

        edtTimer = findViewById(R.id.edt_timer)
        btnTimer = findViewById(R.id.btn_timer)

        btnTimer.setOnClickListener {
            setTimer()
        }
    }

    private fun setTimer(){
        var minutes = edtTimer.text.toString().toInt()
        val timerIntent = Intent(AlarmClock.ACTION_SET_TIMER).apply {
            putExtra(AlarmClock.EXTRA_LENGTH, minutes*60)
            putExtra(AlarmClock.EXTRA_SKIP_UI, true)
        }
        startActivity(timerIntent)
    }
}