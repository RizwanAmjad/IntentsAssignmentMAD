package com.rizwanamjadnov.intentsassignmentmad

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SMSActivity : AppCompatActivity() {
    private lateinit var smsEditText: EditText
    private lateinit var phoneNumberEditText: EditText
    private lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smsactivity)

        smsEditText = findViewById(R.id.smsEditText)
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText)
        sendButton = findViewById(R.id.sendButton)

        sendButton.setOnClickListener {
            val smsIntent = Intent(Intent.ACTION_VIEW)
            smsIntent.type = "vnd.android-dir/mms-sms"
            smsIntent.putExtra("address", phoneNumberEditText.text)
            smsIntent.putExtra("sms_body", smsEditText.text)
            smsIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(smsIntent)

        }

    }
}