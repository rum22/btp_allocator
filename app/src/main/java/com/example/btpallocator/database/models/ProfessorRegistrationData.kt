package com.example.btpallocator.database.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProfessorRegistrationData(
    @PrimaryKey
    val userId: String,
    val password: String,
    val name: String,
    val emailId: String
)