package com.example.myapplication

import android.app.Application
import com.example.myapplication.main.data.WebsiteServiceImpl
import com.example.myapplication.main.domain.WebsiteService
import com.example.myapplication.main.domain.data.MainRepository
import com.example.myapplication.main.domain.data.MainRepositoryImpl
import okhttp3.OkHttpClient
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(
                    basicScopeModule,
                    servicesScopeModule,
                    repoScopeModule,
                )
            )
        }
    }

}

val basicScopeModule = module {
    single { OkHttpClient() }
}
val servicesScopeModule = module {
    single<WebsiteService> { WebsiteServiceImpl(get()) }
}
val repoScopeModule = module {
    single<MainRepository> { MainRepositoryImpl(get()) }
}