package com.home.goldmoviesdemo2.common.di

import com.home.goldmoviesdemo2.viewmodel.MainActivityViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
  viewModel { MainActivityViewModel(get()) }
}
