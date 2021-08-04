package ru.dinarastepina.ulchidictionary.repository

import androidx.lifecycle.LiveData
import ru.dinarastepina.ulchidictionary.data.DictionaryDao
import ru.dinarastepina.ulchidictionary.data.RussianWord
import ru.dinarastepina.ulchidictionary.data.UlchiWord

class DictionaryRepository(private val dao: DictionaryDao) {

    fun getRussianWords(pageSize: Int, offset: Int): LiveData<List<RussianWord>> = dao.getAllRussianWords(pageSize, offset)

    fun searchRussian(word: String, pageSize: Int, offset: Int): LiveData<List<RussianWord>> {
        return dao.searchRussianWords(word, pageSize, offset)
    }

    fun getUlchiWords(pageSize: Int, offset: Int): LiveData<List<UlchiWord>> = dao.getAllUlchiWords(pageSize, offset)

    fun searchUlchi(word: String, pageSize: Int, offset: Int): LiveData<List<UlchiWord>> {
        return dao.searchUlchiWords(word, pageSize, offset)
    }
}