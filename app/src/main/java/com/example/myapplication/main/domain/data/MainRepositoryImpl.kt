package com.example.myapplication.main.domain.data

import com.example.myapplication.main.domain.WebsiteService

class MainRepositoryImpl(
    private val service: WebsiteService
) : MainRepository {

    override suspend fun get() = service.aboutOkHttp()

}