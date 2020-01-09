package com.home.goldmoviesdemo2.model.response

import com.google.gson.annotations.SerializedName
import com.home.goldmoviesdemo2.model.NetworkResponseModel
import com.home.goldmoviesdemo2.model.entities.Star

data class StarsResponse(
    @SerializedName("total_count")
    val totalCount: Int,
    @SerializedName("incomplete_results")
    val incompleteResults: Boolean,
    @SerializedName("items")
    val items: List<Star>
) : NetworkResponseModel