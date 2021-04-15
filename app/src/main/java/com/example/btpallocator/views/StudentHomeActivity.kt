package com.example.btpallocator.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btpallocator.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_student_home.*

class StudentHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_home)
        initViews()
    }
    private fun initViews() {
        btnFill_preferences.setOnClickListener {
            val studentPrefIntent = Intent(this@StudentHomeActivity, FillPreferenceActivity::class.java)
            startActivity(studentPrefIntent)
        }

        btnAllocated_project.setOnClickListener {
            val allocatPrjIntent = Intent(this@StudentHomeActivity, StudentAllocatedProjectActivity::class.java)
            startActivity(allocatPrjIntent)
        }

        btnView_projects.setOnClickListener {
            val viewPrjIntent = Intent(this@StudentHomeActivity, StudentViewProjectsActivity::class.java)
            startActivity(viewPrjIntent)
        }
    }
}