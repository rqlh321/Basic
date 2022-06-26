package com.example.myapplication.main.domain

import com.example.myapplication.main.domain.sideeffect.MainSideEffect

interface MainReducer {
    fun reduce(sideEffect: MainSideEffect)
}