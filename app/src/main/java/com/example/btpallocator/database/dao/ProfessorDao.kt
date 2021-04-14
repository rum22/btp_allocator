package com.example.btpallocator.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.btpallocator.database.models.ProfessorRegistrationData
import com.example.btpallocator.database.models.StudentRegistrationData
import io.reactivex.Single

@Dao
public interface ProfessorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveNewUser(student: ProfessorRegistrationData)

    @Update
    fun updateUser(student: ProfessorRegistrationData)

    @Query("SELECT * FROM ProfessorRegistrationData")
    fun getUser(): LiveData<ProfessorRegistrationData>

    @Query("SELECT * FROM StudentRegistrationData WHERE userId = :userId")
    fun getUserById(userId: String): Single<ProfessorRegistrationData?>

    @Delete
    fun deleteUser(student: ProfessorRegistrationData)

    @Query("DELETE FROM ProfessorRegistrationData")
    fun deleteUserTable()
}