package com.example.ulchidictionary.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

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
            synchronized(this){
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

      /* val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL(
                    "CREATE TABLE `ulchi_russian` (`ulchi` TEXT, `commentone` TEXT, " +
                            "PRIMARY KEY(`ulchi`)); DROP TABLE `russian_ulchi`; CREATE TABLE \\\"russian_ulchi\\\" (\\n\" +\n" +
                            "                        \"\\t\\\"russian\\\"\\tTEXT NOT NULL,\\n\" +\n" +
                            "                        \"\\t\\\"ulchione\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"exampleone\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"exampleonerus\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentone\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchitwo\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenttwo\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchithree\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentthree\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentfour\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentfive\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentsix\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentseven\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenteight\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentnine\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentten\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenteleven\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"exampletwo\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"exampletworus\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"examplethree\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"examplethreerus\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"examplefour\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"examplefourrus\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenttwelve\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"grammar\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentthirteen\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentfourteen\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentfifteen\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchifour\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentsixteen\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentseventeen\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"examplefiverus\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenteighteen\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchifive\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentnineteen\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchisix\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenttwenty\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchiseven\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenttwentyone\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchieight\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenttwentytwo\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchinine\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenttwentythree\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchiten\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenttwentyfour\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchieleven\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenttwentyfive\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchitwelve\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"examplesix\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"examplesixrus\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"exampleseven\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"examplesevenrus\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenttwentysix\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchithirteen\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenttwentyseven\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenttwentyeight\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commenttwentynine\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentthirty\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentthirtyone\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentthirtytwo\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentthirtythree\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchifourteen\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentthirtyfour\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentthirtyfive\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchififteen\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentthirtysix\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"commentthirtyseven\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\t\\\"ulchisixteen\\\"\\tTEXT,\\n\" +\n" +
                            "                        \"\\tPRIMARY KEY(\\\"russian\\\")\\n\" +\n" +
                            "                        \")\""

                )
            }
        }*/
    }



   /* var commentone: String?,
    var russian: String?,
    var commenttwo: String?,
    var russianone: String?,
    var exampleone: String?,
    var exampleonerus: String?,
    var exampletwo: String?,
    var exampletworus: String?,
    var commentthree: String?,
    var commentfour: String?,
    var commentfive: String?,
    var russiantwo: String?,
    var commentsix: String?,
    var russianthree: String?,
    var folk: String?,
    var commentseven: String?,
    var examplethree: String?,
    var commenteight: String?,
    var commentnine: String?,
    var commentten: String?,
    var russianfour: String?,
    var russianfive: String?,
    var commenteleven: String?,
    var examplefour: String?,
    var examplefourrus: String?,
    var commenttwelve: String?,
    var examplefiverus: String?,
    var russiansix: String?,
    var commentthirteen: String?,
    var commentfourteen: String?,
    var russianseven: String?,
    var gram: String?*/
}