package com.example.btpallocator.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btpallocator.R
import kotlinx.android.synthetic.main.activity_admin_home.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_student_login.*

class AdminHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_home)
        initViews()
    }

    private fun initViews() {
        allocat_projects.setOnClickListener {
            val allocatIntent = Intent(this@AdminHomeActivity, AdminViewAllocationActivity::class.java)
            startActivity(allocatIntent)
        }

        view_allocation.setOnClickListener {
            val viewAllocatIntent = Intent(this@AdminHomeActivity, AdminViewAllocationActivity::class.java)
            startActivity(viewAllocatIntent)
        }

        view_students.setOnClickListener {
            val viewStudentIntent = Intent(this@AdminHomeActivity, AdminViewStudentActivity::class.java)
            startActivity(viewStudentIntent)
        }
    }

}