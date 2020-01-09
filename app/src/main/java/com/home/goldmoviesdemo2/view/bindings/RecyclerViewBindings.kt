package com.home.goldmoviesdemo2.view.bindings

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.home.goldmoviesdemo2.model.entities.Star
import com.home.goldmoviesdemo2.view.MovieListAdapter
import com.skydoves.whatif.whatIfNotNullOrEmpty

@BindingAdapter("adapterMovieList")
fun bindAdapterMovieList(view: RecyclerView, movies: List<Star>?) {
    movies.whatIfNotNullOrEmpty {
        val adapter = view.adapter as? MovieListAdapter
        adapter?.addMovieList(it)
    }
}
