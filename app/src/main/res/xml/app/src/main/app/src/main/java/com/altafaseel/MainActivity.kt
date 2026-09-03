package com.altafaseel

import android.accessibilityservice.AccessibilityService
import android.app.Service
import android.content.Intent
import android.os.Bundle
import android.os.IBinder
import android.view.accessibility.AccessibilityEvent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

class AppDetectorAccessibilityService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}
    override fun onInterrupt() {}
}

class ContentFilterForegroundService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null
}
