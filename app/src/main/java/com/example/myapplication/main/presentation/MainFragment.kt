package com.example.myapplication.main.presentation

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R

class MainFragment : Fragment(R.layout.fragment_main) {

    private val text by lazy { requireView().findViewById<TextView>(R.id.text_id) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(this, MainViewModelFactory())[MainViewModel::class.java]

        viewModel.viewState.observe(viewLifecycleOwner) { text.text = it.content }
    }

}