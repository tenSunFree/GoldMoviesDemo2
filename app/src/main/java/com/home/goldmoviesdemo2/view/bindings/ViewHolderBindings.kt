package com.home.goldmoviesdemo2.view.bindings

import android.annotation.SuppressLint
import android.widget.TextView
import androidx.databinding.BindingAdapter

@SuppressLint("SetTextI18n")
@BindingAdapter("bindingStargazersCountText")
fun bindingStargazersCountText(view: TextView, text: Any?) {
    text?.let {
        view.text = "StargazersCount︰$it"
    }
}

@SuppressLint("SetTextI18n")
@BindingAdapter("bindingNameText")
fun bindingNameText(view: TextView, text: Any?) {
    text?.let {
        view.text = "Name︰$it"
    }
}