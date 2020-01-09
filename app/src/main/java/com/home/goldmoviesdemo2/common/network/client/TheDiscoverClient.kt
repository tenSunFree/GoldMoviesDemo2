package com.home.goldmoviesdemo2.common.network.client

import com.home.goldmoviesdemo2.common.network.ApiResponse
import com.home.goldmoviesdemo2.common.network.transform
import com.home.goldmoviesdemo2.model.response.StarsResponse
import com.home.goldmoviesdemo2.common.network.service.TheDiscoverService

/** TheDiscoverClient is a UseCase of the [TheDiscoverService] interface. */
class TheDiscoverClient(private val service: TheDiscoverService) {

    /**
     * @onResult: 當透過retrofit2從Server取得response後, 將response轉換成ApiResponse, 再將ApiResponse回調
     */
    fun fetchDiscoverMovie(
        page: Int,
        onResult: (response: ApiResponse<StarsResponse>) -> Unit
    ) {
        this.service.fetchDiscoverMovie(page).transform(onResult)
    }
}
