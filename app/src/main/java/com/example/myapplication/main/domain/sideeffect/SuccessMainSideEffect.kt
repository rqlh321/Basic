package com.example.myapplication.main.domain.sideeffect

import com.example.myapplication.main.domain.MainViewState

data class SuccessMainSideEffect(
    val content: String
) : MainSideEffect {
    override fun reduce(state: MainViewState) = state.copy(content = content)
}