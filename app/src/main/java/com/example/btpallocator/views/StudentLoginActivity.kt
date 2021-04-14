package com.example.btpallocator.views

import MyViewModelFactory
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.btpallocator.R
import com.example.btpallocator.viewmodel.StudentViewModel
import kotlinx.android.synthetic.main.activity_student_login.*

class StudentLoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: StudentViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_login)
        initViews()
    }

    private val viewModelFactory = MyViewModelFactory(application)

    private fun initViews() {
        loginViewModel = ViewModelProvider(this, viewModelFactory).get(StudentViewModel::class.java)
        btnLogin.setOnClickListener {
            if (etPassword.text.toString().isNotBlank() && etUsername.text.toString()
                    .isNotBlank()
            ) {
                loginViewModel.login(etUsername.text.toString(), etPassword.text.toString())
            }
        }
        observeLogin()
    }

    private fun observeLogin() {
        loginViewModel.studentLoginSuccess.observe(this, Observer {
            if (it) {
                startActivity(Intent(this@StudentLoginActivity, StudentHomeActivity::class.java))
            } else showToast("Invalid creds or user not registered")
        })
    }
}

fun Context.showToast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}