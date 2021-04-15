package com.example.btpallocator.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btpallocator.R
import kotlinx.android.synthetic.main.activity_student_login.*

class ProfLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prof_login)
        initViews()
    }

    private fun initViews() {
        btnLogin.setOnClickListener {
            val profLoginIntent = Intent(this@ProfLoginActivity, ProfHomeActivity::class.java)
            startActivity(profLoginIntent)
        }
    }
}