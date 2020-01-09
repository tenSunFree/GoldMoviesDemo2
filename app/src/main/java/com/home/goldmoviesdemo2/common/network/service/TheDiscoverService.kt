package com.home.goldmoviesdemo2.common.network.service

import com.home.goldmoviesdemo2.model.response.StarsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheDiscoverService {

    @GET("search/repositories?q=language:python&sort=stars")
    fun fetchDiscoverMovie(@Query("page") page: Int): Call<StarsResponse>
}
