package com.home.goldmoviesdemo2.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class License(
    @SerializedName("key")
    var key: String = "",
    @SerializedName("name")
    var name: String = "",
    @SerializedName("spdx_id")
    var spdxId: String = "",
    @SerializedName("url")
    var url: String = "",
    @SerializedName("node_id")
    var nodeId: String = ""
) : Parcelable