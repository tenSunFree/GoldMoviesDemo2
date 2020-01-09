package com.home.goldmoviesdemo2.common.di

import com.home.goldmoviesdemo2.common.network.EndPoint
import com.home.goldmoviesdemo2.common.network.client.TheDiscoverClient
import com.home.goldmoviesdemo2.common.network.service.TheDiscoverService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    single {
        Retrofit.Builder()
            .client(get<OkHttpClient>())
            .baseUrl(EndPoint.TheMovieDB)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single { get<Retrofit>().create(TheDiscoverService::class.java) }

    single { TheDiscoverClient(get()) }
}
