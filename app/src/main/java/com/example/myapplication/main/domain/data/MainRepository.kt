package com.example.myapplication.main.domain.data

interface MainRepository {
    suspend fun get(): String
}