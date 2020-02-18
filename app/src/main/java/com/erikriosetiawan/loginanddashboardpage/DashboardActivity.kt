package com.erikriosetiawan.loginanddashboardpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.erikriosetiawan.loginanddashboardpage.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {

    // Declare the data binding
    private lateinit var binding: ActivityDashboardBinding

    companion object {
        const val DATA_EMAIL_KEY = "data_email_key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Assign the data binding with content view
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dashboard)

        // Set welcome text
        binding.tvWelcome.text = resources.getString(R.string.welcome_text, getDataIntent())
    }

    // Get data from intent
    private fun getDataIntent() = intent?.getStringExtra(DATA_EMAIL_KEY)
}
