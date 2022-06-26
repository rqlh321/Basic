package com.example.myapplication.main.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.main.domain.MainViewState
import com.example.myapplication.main.domain.action.MainAction
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(
    val viewState: LiveData<MainViewState>,
    mainAction: MainAction,
) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.Default) {
            mainAction.execute()
        }
    }

}