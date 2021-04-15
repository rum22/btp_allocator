package com.example.btpallocator.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btpallocator.R
import kotlinx.android.synthetic.main.activity_student_home.*
import kotlinx.android.synthetic.main.activity_student_register.*

class StudentRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_register)
        initViews()
    }

    private fun initViews() {
        btnRegister.setOnClickListener {
            val studRegIntent = Intent(this@StudentRegisterActivity, StudentLoginActivity::class.java)
            startActivity(studRegIntent)
        }
    }
}