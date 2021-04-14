package com.example.btpallocator.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.btpallocator.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        btnStudentLogin.setOnClickListener {
            val studentLoginIntent = Intent(this@MainActivity, StudentLoginActivity::class.java)
            startActivity(studentLoginIntent)
        }

        btnStudentRegister.setOnClickListener {
            val studentRegisterIntent = Intent(this@MainActivity, StudentRegisterActivity::class.java)
            startActivity(studentRegisterIntent)
        }
    }
}