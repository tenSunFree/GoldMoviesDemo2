package com.home.goldmoviesdemo2.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.observe
import com.home.goldmoviesdemo2.R
import com.home.goldmoviesdemo2.common.base.DatabindingFragment
import com.home.goldmoviesdemo2.common.extensions.toast
import com.home.goldmoviesdemo2.databinding.FragmentMovieBinding
import com.home.goldmoviesdemo2.model.entities.Star
import com.home.goldmoviesdemo2.view.viewholders.MovieListViewHolder
import com.home.goldmoviesdemo2.viewmodel.MainActivityViewModel
import com.skydoves.baserecyclerviewadapter.RecyclerViewPaginator
import kotlinx.android.synthetic.main.fragment_movie.*
import org.koin.android.viewmodel.ext.android.viewModel

class MovieListFragment : DatabindingFragment(), MovieListViewHolder.Delegate {

    private val viewModel by viewModel<MainActivityViewModel>()
    private lateinit var binding: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = binding(inflater, R.layout.fragment_movie, container)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeUI()
        loadMore(page = 1)
        observeMessages()
    }

    private fun initializeUI() {
        recyclerView.adapter = MovieListAdapter(this)
        RecyclerViewPaginator(
            recyclerView = recyclerView,
            isLoading = { viewModel.isLoading() },
            loadMore = { loadMore(it) },
            onLast = { false }
        ).apply {
            threshold = 10
            currentPage = 1
        }
    }

    private fun loadMore(page: Int) = viewModel.postMoviePage(page)

    override fun onItemClick(movie: Star): Unit =
        run { context?.toast(movie.stargazersCount.toString()) }

    private fun observeMessages() =
        this.viewModel.toastLiveData.observe(this) { context?.toast(it) }
}
