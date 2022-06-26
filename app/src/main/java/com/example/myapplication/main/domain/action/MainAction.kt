package com.example.myapplication.main.domain.action

import com.example.myapplication.action.Empty

interface MainAction {
    suspend fun execute(params: Empty = Empty)
}