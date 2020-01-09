package com.home.goldmoviesdemo2.common

import android.app.Application
import com.home.goldmoviesdemo2.common.di.networkModule
import com.home.goldmoviesdemo2.common.di.repositoryModule
import com.home.goldmoviesdemo2.common.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class GMDApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@GMDApplication)
            modules(networkModule)
            modules(repositoryModule)
            modules(viewModelModule)
        }
    }
}
