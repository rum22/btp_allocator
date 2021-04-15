package com.example.btpallocator.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btpallocator.R
import kotlinx.android.synthetic.main.activity_admin_login.*
import kotlinx.android.synthetic.main.activity_student_login.*

class AdminLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_login)
        initViews()
    }

    private fun initViews() {
        button.setOnClickListener {
            val adminLoginIntent = Intent(this@AdminLoginActivity, AdminHomeActivity::class.java)
            startActivity(adminLoginIntent)
        }
    }
}