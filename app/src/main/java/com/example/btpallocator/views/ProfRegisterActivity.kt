package com.example.btpallocator.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btpallocator.R
import kotlinx.android.synthetic.main.activity_student_home.*
import kotlinx.android.synthetic.main.activity_student_register.*

class ProfRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prof_register)
        initViews()
    }
    private fun initViews() {
        btnRegister.setOnClickListener {
            val profRegIntent = Intent(this@ProfRegisterActivity, ProfLoginActivity::class.java)
            startActivity(profRegIntent)
        }
    }
}