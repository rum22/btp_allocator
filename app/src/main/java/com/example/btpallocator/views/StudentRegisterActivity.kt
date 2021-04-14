package com.example.btpallocator.views

import StudentViewModelFactory
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.btpallocator.R
import com.example.btpallocator.database.models.StudentRegistrationData
import com.example.btpallocator.viewmodel.StudentViewModel
import kotlinx.android.synthetic.main.activity_student_register.*

class StudentRegisterActivity : AppCompatActivity() {

    private lateinit var loginViewModel: StudentViewModel
    private val viewModelFactory = StudentViewModelFactory(application)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_register)
        initViews()
    }

    private fun initViews() {
        loginViewModel = ViewModelProvider(this, viewModelFactory).get(StudentViewModel::class.java)
        btnRegister.setOnClickListener {
            if (hasValidInputs()) {
                val userName = etUserName.text.toString()
                val password = etPassword.text.toString()
                val fullName = etName.text.toString()
                val cgpa = etCGPA.text.toString().toFloat()
                val email = etEmail.text.toString()
                val student = StudentRegistrationData(userName, password, fullName, cgpa, email)

                loginViewModel.register(student)

                val intent = Intent(this@StudentRegisterActivity, StudentHomeActivity::class.java)
                startActivity(intent)
            }
        }

    }

    private fun hasValidInputs(): Boolean {
        return true
    }
}