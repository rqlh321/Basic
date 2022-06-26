package com.example.myapplication.main.presentation

import androidx.lifecycle.MutableLiveData
import com.example.myapplication.main.domain.MainReducer
import com.example.myapplication.main.domain.MainViewState
import com.example.myapplication.main.domain.sideeffect.MainSideEffect

class MainReducerImpl(
    private val viewState: MutableLiveData<MainViewState?>
) : MainReducer {
    override fun reduce(sideEffect: MainSideEffect) {
        viewState.value?.let { viewState.postValue(sideEffect.reduce(it)) }
    }
}