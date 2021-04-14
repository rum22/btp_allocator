package com.example.btpallocator.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.btpallocator.R
import com.example.btpallocator.database.dao.ProfessorDao
import com.example.btpallocator.database.dao.StudentDao
import com.example.btpallocator.database.models.ProfessorRegistrationData
import com.example.btpallocator.database.models.StudentRegistrationData

@Database(entities = [StudentRegistrationData::class, ProfessorRegistrationData::class], version = 1, exportSchema = false)

//@TypeConverters(ListTypeConverter::class)
abstract class AppDatabase : RoomDatabase() {

    // Dao
    abstract fun studentDao(): StudentDao
    abstract fun professorDao(): ProfessorDao

    companion object {

        // DB Instance
        private var dbInstance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            if (dbInstance == null) {
                dbInstance = Room.databaseBuilder(
                    context.applicationContext, AppDatabase::class.java,
                    context.getString(R.string.db_name)
                )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return dbInstance as AppDatabase
        }

        fun destroyInstance() {
            if (dbInstance != null && dbInstance!!.isOpen) dbInstance!!.close()
            dbInstance = null
        }
    }
}