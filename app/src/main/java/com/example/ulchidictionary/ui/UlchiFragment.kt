package com.example.ulchidictionary.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.ulchidictionary.R
import kotlinx.android.synthetic.main.fragment_ulchi.view.*

class UlchiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ulchi, container, false)
        view.arrow.setOnClickListener {
            val action = UlchiFragmentDirections.actionUlchiFragmentToRussianFragment()
            view.arrow.findNavController().navigate(action)
        }
        return view
    }
}