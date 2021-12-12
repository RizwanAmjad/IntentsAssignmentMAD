package com.rizwanamjadnov.intentsassignmentmad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class add_contactActivity : AppCompatActivity() {
    private lateinit var editName :EditText
    private lateinit var editPhoneNo:EditText

    private lateinit var btn_add: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)
        editName =findViewById(R.id.editTextTextPersonName)
        editPhoneNo =findViewById(R.id.editTextNumber)
        btn_add =findViewById(R.id.button)
        btn_add.setOnClickListener{
createContact()
        }

    }
    private fun createContact(){

    }
}