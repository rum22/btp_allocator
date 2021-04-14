package com.example.btpallocator.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.btpallocator.database.models.StudentRegistrationData

@Dao
public interface StudentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveNewUser(student: StudentRegistrationData)

    @Update
    fun updateUser(student: StudentRegistrationData)

    @Query("SELECT * FROM StudentRegistrationData")
    fun getUser(): LiveData<StudentRegistrationData>

    @Delete
    fun deleteUser(student: StudentRegistrationData)

    @Query("DELETE FROM StudentRegistrationData")
    fun deleteUserTable()
}