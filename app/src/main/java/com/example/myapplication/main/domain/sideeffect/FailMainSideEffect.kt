package com.example.myapplication.main.domain.sideeffect

import com.example.myapplication.main.domain.MainViewState

object FailMainSideEffect : MainSideEffect {
    override fun reduce(state: MainViewState) = state.copy(
        content = "Ошибка"
    )
}