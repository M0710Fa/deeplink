package com.example.deeplink

import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DeeplinkActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textHello)
        textView.text = "Opened by Deeplink"
        val action:String? = intent?.action
        val data: Uri? = intent?.data
    }
}