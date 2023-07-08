package com.nela.absensi.database

import androidx.room.Database
import com.nela.absensi.model.ModelDatabase
import androidx.room.RoomDatabase
import com.nela.absensi.database.dao.DatabaseDao

@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}