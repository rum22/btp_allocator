package com.example.btpallocator.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.btpallocator.database.models.ProjectData

interface ProjectDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveNewProject(student: ProjectData)

    @Update
    fun updateProject(project: ProjectData)

    @Query("SELECT * FROM ProjectData")
    fun getProject(): LiveData<ProjectData>

    @Delete
    fun deleteProject(project: ProjectData)

    @Query("DELETE FROM ProjectData")
    fun deleteProjectTable()
}