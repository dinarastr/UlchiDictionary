package com.example.ulchidictionary.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ulchidictionary.R
import com.example.ulchidictionary.adapters.RussianAdapter
import com.example.ulchidictionary.adapters.UlchiAdapter
import com.example.ulchidictionary.data.RussianWord
import com.example.ulchidictionary.data.UlchiWord
import com.example.ulchidictionary.viewmodel.SharedViewModel
import kotlinx.android.synthetic.main.fragment_russian.view.*
import kotlinx.android.synthetic.main.fragment_ulchi.view.*
import kotlinx.android.synthetic.main.fragment_ulchi.view.arrow
import kotlinx.android.synthetic.main.fragment_ulchi.view.searchView

class UlchiFragment : Fragment() {

    private val vm: SharedViewModel by viewModels()
    private var ulchiWords: List<UlchiWord> = emptyList()
    private val adapter: UlchiAdapter by lazy { UlchiAdapter(
        onLastItemBound = { offset ->
            loadNextPage(query = view?.searchView?.text?.toString() ?: "", offset = offset)
        })
    }
    private var canLoadMore = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ulchi, container, false)
        view.arrow.setOnClickListener {
            val action = UlchiFragmentDirections.actionUlchiFragmentToRussianFragment()
            view.arrow.findNavController().navigate(action)
        }

        val recycler = view.ulchiwords_rv
        recycler.adapter = adapter
        recycler.setItemViewCacheSize(10)
        recycler.layoutManager = LinearLayoutManager(requireActivity())
        loadNextPage(query = view.searchView.text?.toString() ?: "", offset = 0)
        view.searchView.addTextChangedListener(textWatcher)

        Log.i("Dinara", view.searchView.text.toString())
        return view
    }

    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) = Unit
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) = Unit
        override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
            canLoadMore = true
            loadNextPage(query = s?.toString() ?: "", offset = 0)
        }
    }

    private fun loadNextPage(query: String, offset: Int) {
        if (canLoadMore.not()) return


        val liveData = when (query.isEmpty()) {

            true ->
                vm.allUlchiWords(pageSize = PAGE_SIZE, offset = offset)
            false ->
                vm.searchUlchi(word = query, pageSize = PAGE_SIZE, offset = offset)
        }

        liveData.observe(viewLifecycleOwner) { words ->
            canLoadMore = words.size == PAGE_SIZE
            val newList = if (offset == 0) words else ulchiWords + words
            ulchiWords = newList
            adapter.setData(ulchiWords)
        }

    }

    companion object {
        private const val PAGE_SIZE = 10
    }
}