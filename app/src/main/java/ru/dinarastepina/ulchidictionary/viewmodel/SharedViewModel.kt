package ru.dinarastepina.ulchidictionary.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import ru.dinarastepina.ulchidictionary.data.RussianWord
import ru.dinarastepina.ulchidictionary.data.UlchiDatabase
import ru.dinarastepina.ulchidictionary.data.UlchiWord
import ru.dinarastepina.ulchidictionary.repository.DictionaryRepository

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