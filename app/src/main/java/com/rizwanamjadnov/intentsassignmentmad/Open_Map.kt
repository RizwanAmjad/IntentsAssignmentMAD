package com.rizwanamjadnov.intentsassignmentmad

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Open_Map : AppCompatActivity() {
    private lateinit var map_btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_map)
        map_btn =findViewById(R.id.button3)

        map_btn.setOnClickListener{

showMap()
        }
    }
    fun showMap() {
        //Open Map at Specific Location
        val gmmIntentUri = Uri.parse("geo:37.7749,-122.4194")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)


    }

}