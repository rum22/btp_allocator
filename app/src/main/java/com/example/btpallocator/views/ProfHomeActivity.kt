package com.example.btpallocator.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btpallocator.R
import kotlinx.android.synthetic.main.activity_prof_home.*
import kotlinx.android.synthetic.main.activity_student_home.*

class ProfHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prof_home)
        initViews()
    }
    private fun initViews() {
        btnAddAProject.setOnClickListener {
            val studentAddProjIntent = Intent(this@ProfHomeActivity, AddProjectActivity::class.java)
            startActivity(studentAddProjIntent)
        }
    }
}