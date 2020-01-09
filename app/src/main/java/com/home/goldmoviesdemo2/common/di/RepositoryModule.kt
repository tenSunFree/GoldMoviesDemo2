package com.home.goldmoviesdemo2.common.di

import com.home.goldmoviesdemo2.model.repository.DiscoverRepository
import org.koin.dsl.module

val repositoryModule = module {
  single { DiscoverRepository(get()) }
}
