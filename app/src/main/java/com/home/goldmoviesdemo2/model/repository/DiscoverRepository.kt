package com.home.goldmoviesdemo2.model.repository

import androidx.lifecycle.MutableLiveData
import com.home.goldmoviesdemo2.common.network.ApiResponse
import com.home.goldmoviesdemo2.common.network.client.TheDiscoverClient
import com.home.goldmoviesdemo2.common.network.message
import com.home.goldmoviesdemo2.model.entities.Star
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DiscoverRepository constructor(
    private val discoverClient: TheDiscoverClient
) : Repository {

    override var isLoading: Boolean = false

    /**
     * @withContext(Dispatchers.IO): 跑在WorkerThread上
     * @liveData.apply{}: 返回LiveData<List<Movie>>
     * @error: 將錯誤訊息回調
     */
    suspend fun loadMovies(page: Int, error: (String) -> Unit) = withContext(Dispatchers.IO) {
        val liveData = MutableLiveData<List<Star>>()
        var movies = listOf<Star>()
        isLoading = true
        discoverClient.fetchDiscoverMovie(page) { response ->
            isLoading = false
            when (response) {
                is ApiResponse.Success -> {
                    response.data?.let { data ->
                        movies = data.items
                        liveData.postValue(movies)
                    }
                }
                is ApiResponse.Failure.Error -> error(response.message())
                is ApiResponse.Failure.Exception -> error(response.message())
            }
        }
        liveData.apply { postValue(movies) }
    }
}
