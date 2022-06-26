package com.example.myapplication.main.data

import com.example.myapplication.main.domain.WebsiteService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request

class WebsiteServiceImpl(
    private val client: OkHttpClient
) : WebsiteService {
    override suspend fun aboutOkHttp(): String {
        val request = Request.Builder().url("https://square.github.io/okhttp/").build()
        val execute = withContext(Dispatchers.IO) { client.newCall(request).execute() }
        val result = execute.body?.string().toString()
        return result
    }
}