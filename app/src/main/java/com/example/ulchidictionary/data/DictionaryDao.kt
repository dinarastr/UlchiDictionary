package com.example.ulchidictionary.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query


@Dao
interface DictionaryDao {

    @Query("select * from russian_to_nanay order by russian asc LIMIT :pageSize OFFSET :offset")
    fun getAllRussianWords(pageSize: Int, offset: Int): LiveData<List<RussianWord>>

    @Query("select * from russian_to_nanay where russian like :word || '%' order by russian asc LIMIT :pageSize OFFSET :offset")
    fun searchRussianWords(word: String, pageSize: Int, offset: Int): LiveData<List<RussianWord>>
}