package com.home.goldmoviesdemo2.view.viewholders

import android.view.View
import com.home.goldmoviesdemo2.databinding.ItemMovieBinding
import com.home.goldmoviesdemo2.model.entities.Star
import com.skydoves.baserecyclerviewadapter.BaseViewHolder

/** MovieListViewHolder is a viewHolder class for binding a [Movie] item. */
class MovieListViewHolder(
    view: View,
    private val delegate: Delegate
) : BaseViewHolder(view) {

    interface Delegate {
        fun onItemClick(movie: Star)
    }

    private lateinit var movie: Star
    private val binding by bindings<ItemMovieBinding>(view)

    override fun bindData(data: Any) {
        if (data is Star) {
            movie = data
            binding.apply {
                movie = data
                executePendingBindings()
            }
        }
    }

    override fun onClick(v: View?) = delegate.onItemClick(movie)

    override fun onLongClick(v: View?) = false
}
