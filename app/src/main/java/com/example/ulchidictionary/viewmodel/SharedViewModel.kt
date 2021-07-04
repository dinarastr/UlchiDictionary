package com.example.ulchidictionary.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.ulchidictionary.data.RussianWord
import com.example.ulchidictionary.data.UlchiDatabase
import com.example.ulchidictionary.repository.DictionaryRepository

class SharedViewModel(application: Application): AndroidViewModel(application){
    private val dao = UlchiDatabase.getDatabase(application).DictionaryDao()
    private val repository: DictionaryRepository

    fun allRussianWords(pageSize: Int, offset: Int): LiveData<List<RussianWord>> {
        return repository.getRussianWords(pageSize, offset)
    }

    fun searchRussian(word: String, pageSize: Int, offset: Int): LiveData<List<RussianWord>> {
        return repository.searchRussian(word, pageSize, offset)
    }


    init {
        repository = DictionaryRepository(dao)
    }
}