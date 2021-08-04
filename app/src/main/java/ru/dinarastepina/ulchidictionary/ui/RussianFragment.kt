package ru.dinarastepina.ulchidictionary.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import ru.dinarastepina.ulchidictionary.R
import ru.dinarastepina.ulchidictionary.adapters.RussianAdapter
import ru.dinarastepina.ulchidictionary.data.RussianWord
import ru.dinarastepina.ulchidictionary.viewmodel.SharedViewModel
import kotlinx.android.synthetic.main.fragment_russian.*
import kotlinx.android.synthetic.main.fragment_russian.view.*

class RussianFragment : Fragment() {

    private val vm: SharedViewModel by viewModels()
    private var russianwords: List<RussianWord> = emptyList()
    private val adapter: RussianAdapter by lazy { RussianAdapter(
        onLastItemBound = { offset ->
        loadNextPage(query = view?.searchView?.text?.toString() ?: "", offset = offset)
    })
    }
    private var canLoadMore = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_russian, container, false)
        view.arrow.setOnClickListener {
            val action =
                RussianFragmentDirections.actionRussianFragmentToUlchiFragment()
            view.arrow.findNavController().navigate(action)
        }
        val recycler = view.russianwords_rv
        recycler.adapter = adapter
        recycler.setItemViewCacheSize(10)
        recycler.layoutManager = LinearLayoutManager(requireActivity())
        loadNextPage(query = view.searchView.text?.toString() ?: "", offset = 0)
        view.searchView.addTextChangedListener(textWatcher)

        Log.i("Dinara", view.searchView.text.toString())
        setHasOptionsMenu(true)

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
                vm.allRussianWords(pageSize = PAGE_SIZE, offset = offset)
            false ->
                vm.searchRussian(word = query, pageSize = PAGE_SIZE, offset = offset)
        }

        liveData.observe(viewLifecycleOwner) { words ->
            canLoadMore = words.size == PAGE_SIZE
            val newList = if (offset == 0) words else russianwords + words
            russianwords = newList
            adapter.setData(russianwords)
        }

    }

    private fun openInfo(): Boolean {
        arrow.findNavController().navigate(RussianFragmentDirections.actionRussianFragmentToAboutFragment())
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_click ->
                openInfo()
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }

    companion object {
        private const val PAGE_SIZE = 10
    }
}