package com.example.btpallocator.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.btpallocator.database.models.StudentResponseData

@Dao
public interface StudentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveNewUser(student: StudentResponseData)

    @Update
    fun updateUser(student: StudentResponseData)

    @Query("SELECT * FROM StudentResponseData")
    fun getUser(): LiveData<StudentResponseData>

    @Delete
    fun deleteUser(student: StudentResponseData)

    @Query("DELETE FROM StudentResponseData")
    fun deleteUserTable()
}