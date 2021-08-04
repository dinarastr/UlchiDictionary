package ru.dinarastepina.ulchidictionary.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//@AutoMigration(from = 1, to = 2)
@Database(version = 1, entities = [RussianWord::class, UlchiWord::class], exportSchema = false)
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
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UlchiDatabase::class.java,
                    "ulchi_dic.db"
                ).createFromAsset("ulchi_dic.db")
                    //.addMigrations(MIGRATION_1_2)
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}