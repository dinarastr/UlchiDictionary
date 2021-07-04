package com.example.ulchidictionary.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [RussianWord::class], version = 1, exportSchema = false)
abstract class UlchiDatabase: RoomDatabase() {

    abstract fun DictionaryDao(): DictionaryDao

    companion object {

        @Volatile
        private var INSTANCE: UlchiDatabase? = null

        fun getDatabase(context: Context): UlchiDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UlchiDatabase::class.java,
                    "russian_ulchi.db"
                ).createFromAsset("russian_ulchi.db")
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}