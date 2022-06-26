package com.example.myapplication.main.domain.action.impl

import com.example.myapplication.action.Empty
import com.example.myapplication.main.domain.MainReducer
import com.example.myapplication.main.domain.action.MainAction
import com.example.myapplication.main.domain.data.MainRepository
import com.example.myapplication.main.domain.sideeffect.FailMainSideEffect
import com.example.myapplication.main.domain.sideeffect.LoadMainSideEffect
import com.example.myapplication.main.domain.sideeffect.SuccessMainSideEffect

class MainActionImpl(
    private val repo: MainRepository,
    private val reducer: MainReducer,
) : MainAction {

    override suspend fun execute(params: Empty) {
        try {
            reducer.reduce(LoadMainSideEffect)
            val response = repo.get()
            reducer.reduce(SuccessMainSideEffect(response))
        } catch (e: Exception) {
            reducer.reduce(FailMainSideEffect)
        }
    }
}