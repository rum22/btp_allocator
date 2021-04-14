package com.example.btpallocator.database.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StudentRegistrationData(
    @PrimaryKey
    val userId: String,
    val password: String,
    val name: String,
    val cgpa: Float,
    val emailId: String,
    val allocatedProjectId: Int? = null,
    val pref1: Int? = null,
    val pref2: Int? = null,
    val pref3: Int? = null,
    val pref4: Int? = null
)
