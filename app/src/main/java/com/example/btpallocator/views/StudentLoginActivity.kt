package com.example.btpallocator.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btpallocator.R
import com.example.btpallocator.views.StudentHomeActivity
import kotlinx.android.synthetic.main.activity_student_login.*
import kotlinx.android.synthetic.main.activity_student_register.*

class StudentLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_login)
        initViews()
    }

    private fun initViews() {
        btnLogin.setOnClickListener {
            val studLoginIntent = Intent(this@StudentLoginActivity, StudentHomeActivity::class.java)
            startActivity(studLoginIntent)
        }
    }
}