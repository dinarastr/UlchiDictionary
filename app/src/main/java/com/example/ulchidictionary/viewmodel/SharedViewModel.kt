package com.example.ulchidictionary.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.ulchidictionary.data.RussianWord
import com.example.ulchidictionary.data.UlchiDatabase
import com.example.ulchidictionary.data.UlchiWord
import com.example.ulchidictionary.repository.DictionaryRepository

class SharedViewModel(application: Application): AndroidViewModel(application){
    private val dao = UlchiDatabase.getDatabase(application).DictionaryDao()
    private val repository: DictionaryRepository = DictionaryRepository(dao)

    fun allRussianWords(pageSize: Int, offset: Int): LiveData<List<RussianWord>> {
        return repository.getRussianWords(pageSize, offset)
    }

    fun searchRussian(word: String, pageSize: Int, offset: Int): LiveData<List<RussianWord>> {
        return repository.searchRussian(word, pageSize, offset)
    }

    fun allUlchiWords(pageSize: Int, offset: Int): LiveData<List<UlchiWord>> {
        return repository.getUlchiWords(pageSize, offset)
    }

    fun searchUlchi(word: String, pageSize: Int, offset: Int): LiveData<List<UlchiWord>> {
        return repository.searchUlchi(word, pageSize, offset)
    }
}