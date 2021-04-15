package com.example.btpallocator.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btpallocator.R
import kotlinx.android.synthetic.main.activity_fill_preference.*
import kotlinx.android.synthetic.main.activity_student_login.*

class FillPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fill_preference)
        initViews()
    }

    private fun initViews() {
        button.setOnClickListener {
            val fillPrefIntent = Intent(this@FillPreferenceActivity, StudentHomeActivity::class.java)
            startActivity(fillPrefIntent)
        }
    }
}