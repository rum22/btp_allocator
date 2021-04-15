package com.example.btpallocator.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btpallocator.R
import kotlinx.android.synthetic.main.activity_add_project.*
import kotlinx.android.synthetic.main.activity_student_login.*

class AddProjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_project)
        initViews()
    }

    private fun initViews() {
        button.setOnClickListener {
            val addPrjIntent = Intent(this@AddProjectActivity, ProfHomeActivity::class.java)
            startActivity(addPrjIntent)
        }
    }
}