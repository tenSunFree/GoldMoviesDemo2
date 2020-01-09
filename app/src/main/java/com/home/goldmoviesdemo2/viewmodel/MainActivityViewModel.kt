package com.home.goldmoviesdemo2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.switchMap
import com.home.goldmoviesdemo2.common.base.LiveCoroutinesViewModel
import com.home.goldmoviesdemo2.model.entities.Star
import com.home.goldmoviesdemo2.model.repository.DiscoverRepository

class MainActivityViewModel
constructor(
    private val discoverRepository: DiscoverRepository
) : LiveCoroutinesViewModel() {

    private var moviePageLiveData: MutableLiveData<Int> = MutableLiveData()
    val movieListLiveData: LiveData<List<Star>>

    val toastLiveData: MutableLiveData<String> = MutableLiveData()

    init {
        // switchMap(): 將原本的LiveData轉化, 返回一個新的類型的LiveData
        this.movieListLiveData = this.moviePageLiveData.switchMap { page ->
            launchOnViewModelScope {
                this.discoverRepository.loadMovies(page) { this.toastLiveData.postValue(it) }
            }
        }
    }

    fun postMoviePage(page: Int) = this.moviePageLiveData.postValue(page)

    fun isLoading() = this.discoverRepository.isLoading
}
