package com.rizwanamjadnov.intentsassignmentmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class CameraIntentActivity : AppCompatActivity() {
    private lateinit var btnCamera:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_intent)

        btnCamera = findViewById(R.id.btn_camera)
        btnCamera.setOnClickListener {
            launchCamera()
        }
    }
    private fun launchCamera(){
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply {
        }
        startActivity(cameraIntent)
    }
}