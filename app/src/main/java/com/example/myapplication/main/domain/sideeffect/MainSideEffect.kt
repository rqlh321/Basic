package com.example.myapplication.main.domain.sideeffect

import com.example.myapplication.main.domain.MainViewState

sealed interface MainSideEffect {
    fun reduce(state: MainViewState): MainViewState
}