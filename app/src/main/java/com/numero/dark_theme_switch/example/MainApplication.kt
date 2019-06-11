package com.numero.dark_theme_switch.example

import android.app.Application
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(listOf(repositoryModule, viewModelModule))
        }
    }

    private val viewModelModule = module {
        viewModel { MainViewModel(get()) }
    }

    private val repositoryModule = module {
        single<MainRepository> { MainRepositoryImpl() }
    }
}