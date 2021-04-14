package com.example.btpallocator.database.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StudentResponseData(
    @PrimaryKey
    val id: String,
    val isEmailVerified: Boolean? = null,
    val isPhoneVerified: Boolean? = null,
    val isBlocked: Boolean? = null,
    val isActive: Boolean? = null,
    val fullName: String? = "",
    val shortName: String? = "",
    val isNewUser: Boolean = true,
    val email: String? = "",
    val phone: Long? = null,
    val dob: String? = null,
    val gender: String? = "",
    val countryCode: Int? = null,
    val fullPhoneNumber: String? = ""
)
