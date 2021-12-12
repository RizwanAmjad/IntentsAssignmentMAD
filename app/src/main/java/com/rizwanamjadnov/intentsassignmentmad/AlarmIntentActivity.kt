package com.rizwanamjadnov.intentsassignmentmad

import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.provider.AlarmClock
import android.widget.Button
import android.widget.TimePicker

class AlarmIntentActivity : AppCompatActivity() {
    private lateinit var btnAlarm:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_intent)

        btnAlarm = findViewById(R.id.btn_alarm)
        btnAlarm.setOnClickListener {
            setAlarm()
        }
    }
    private fun setAlarm(){
        val timePicker = TimePickerDialog(this,
            timePickerDialogListener,
            12,
            0,
            false)
        timePicker.create()
        timePicker.show()

    }
    private val timePickerDialogListener= object : TimePickerDialog.OnTimeSetListener {
            override fun onTimeSet(view: TimePicker?, hour: Int, minute: Int) {
                val alarmIntent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                    putExtra(AlarmClock.EXTRA_HOUR, hour)
                    putExtra(AlarmClock.EXTRA_MINUTES, minute)
                }
                startActivity(alarmIntent)
            }
        }

}