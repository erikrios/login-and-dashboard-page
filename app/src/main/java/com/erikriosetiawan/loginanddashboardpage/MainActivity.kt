package com.erikriosetiawan.loginanddashboardpage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.erikriosetiawan.loginanddashboardpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Declare the data binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Assign the data binding with content view
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    // Passing data using intent between activities
    private fun sendEmailData() {

        // Validate the login form
        var isEmptyEmail = false
        var isEmptyPassword = false

        if (binding.tvEmailAddress.text.toString().isEmpty()) {
            isEmptyEmail = true
            binding.tvEmailAddress.error = getString(R.string.empty_email_address_error_message)
        }

        if (binding.tvPassword.text.toString().isEmpty()) {
            isEmptyPassword = true
            binding.tvPassword.error = getString(R.string.empty_password_error_message)
        }

        if (!isEmptyEmail && !isEmptyPassword) {
            // Passing data using explicit intent
            val intent = Intent(this, DashboardActivity::class.java)
            intent.putExtra(
                DashboardActivity.DATA_EMAIL_KEY,
                binding.tvEmailAddress.text.toString()
            )
            startActivity(intent)
        }
    }
}
