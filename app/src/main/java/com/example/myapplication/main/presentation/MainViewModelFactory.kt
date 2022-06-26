package com.example.myapplication.main.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.main.domain.MainViewState
import com.example.myapplication.main.domain.action.impl.MainActionImpl
import org.koin.core.KoinComponent
import org.koin.core.get

class MainViewModelFactory : ViewModelProvider.Factory, KoinComponent {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            val viewState = MutableLiveData(MainViewState())
            val reducer = MainReducerImpl(viewState)
            val mainAction = MainActionImpl(
                repo = get(),
                reducer = reducer
            )
            return MainViewModel(viewState, mainAction) as T
        } else {
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}