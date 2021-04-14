package com.example.btpallocator.database.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProjectData(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val professorId: Int,
    val title: String,
    val description: String

)