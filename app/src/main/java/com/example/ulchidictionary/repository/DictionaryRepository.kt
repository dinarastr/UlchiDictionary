package com.example.ulchidictionary.repository

import androidx.lifecycle.LiveData
import com.example.ulchidictionary.data.DictionaryDao
import com.example.ulchidictionary.data.RussianWord

class DictionaryRepository(private val dao: DictionaryDao) {

    fun getRussianWords(pageSize: Int, offset: Int): LiveData<List<RussianWord>> = dao.getAllRussianWords(pageSize, offset)

    fun searchRussian(word: String, pageSize: Int, offset: Int): LiveData<List<RussianWord>> {
        return dao.searchRussianWords(word, pageSize, offset)
    }
}