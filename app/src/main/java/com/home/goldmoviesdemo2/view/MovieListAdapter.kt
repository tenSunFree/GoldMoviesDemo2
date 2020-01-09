package com.home.goldmoviesdemo2.view

import android.view.View
import com.home.goldmoviesdemo2.R
import com.home.goldmoviesdemo2.model.entities.Star
import com.home.goldmoviesdemo2.view.viewholders.MovieListViewHolder
import com.skydoves.baserecyclerviewadapter.BaseAdapter
import com.skydoves.baserecyclerviewadapter.SectionRow

/** MovieListAdapter is an adapter class for binding [Movie] items. */
class MovieListAdapter(
    private val delegate: MovieListViewHolder.Delegate
) : BaseAdapter() {

    init {
        addSection(ArrayList<Star>())
    }

    fun addMovieList(movies: List<Star>) {
        val section = sections()[0]
        section.addAll(movies)
        notifyItemRangeInserted(section.size - movies.size + 1, movies.size)
    }

    override fun layout(sectionRow: SectionRow) = R.layout.item_movie

    override fun viewHolder(layout: Int, view: View) = MovieListViewHolder(view, delegate)
}
