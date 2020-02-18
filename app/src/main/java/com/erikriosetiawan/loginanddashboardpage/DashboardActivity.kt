package com.erikriosetiawan.loginanddashboardpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DashboardActivity : AppCompatActivity() {

    companion object {
        const val DATA_EMAIL_KEY = "data_email_key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }
}
