package com.example.ulchidictionary.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query


@Dao
interface DictionaryDao {

    @Query("select * from russian_to_ulchi order by russian asc LIMIT :pageSize OFFSET :offset")
    fun getAllRussianWords(pageSize: Int, offset: Int): LiveData<List<RussianWord>>

    @Query("select * from russian_to_ulchi where russian like :word || '%' order by russian asc LIMIT :pageSize OFFSET :offset")
    fun searchRussianWords(word: String, pageSize: Int, offset: Int): LiveData<List<RussianWord>>

    @Query("select * from ulchi_to_russian order by ulchi asc LIMIT :pageSize OFFSET :offset")
    fun getAllUlchiWords(pageSize: Int, offset: Int): LiveData<List<UlchiWord>>

    @Query("select * from ulchi_to_russian where ulchi like :word || '%' order by ulchi asc LIMIT :pageSize OFFSET :offset")
    fun searchUlchiWords(word: String, pageSize: Int, offset: Int): LiveData<List<UlchiWord>>
}