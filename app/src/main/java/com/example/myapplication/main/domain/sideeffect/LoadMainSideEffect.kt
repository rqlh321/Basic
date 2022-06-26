package com.example.myapplication.main.domain.sideeffect

import com.example.myapplication.main.domain.MainViewState

object LoadMainSideEffect : MainSideEffect {
    override fun reduce(state: MainViewState) = state.copy(
        content = "Загрузка"
    )
}