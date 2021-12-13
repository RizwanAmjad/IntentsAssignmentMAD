package com.rizwanamjadnov.intentsassignmentmad

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ViewMessages : AppCompatActivity() {
    private lateinit var phoneNumberEditText: EditText
    private lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_messages)

        phoneNumberEditText = findViewById(R.id.phoneNumberEditText)
        sendButton = findViewById(R.id.viewButton)

        sendButton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW,
                Uri.fromParts("sms", phoneNumberEditText.text.toString(),
                    null)))
        }
    }
}