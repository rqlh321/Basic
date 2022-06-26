package com.example.myapplication

import com.example.myapplication.main.domain.WebsiteService
import com.example.myapplication.main.domain.data.MainRepositoryImpl
import io.mockk.every
import io.mockk.mockk
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val service = mockk<WebsiteService>()
    private val repo = MainRepositoryImpl(service)

    @Test
    fun addition_isCorrect() {
        every { service.aboutOkHttp() } returns "test"
        val result = repo.get()
        assert(result == "test")
    }
}