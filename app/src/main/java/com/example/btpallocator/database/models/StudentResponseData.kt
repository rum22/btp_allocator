package com.example.btpallocator.database.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StudentResponseData(
    @PrimaryKey
    val id: String
)
