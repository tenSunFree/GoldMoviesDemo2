package com.home.goldmoviesdemo2.common.extensions

import android.content.Context
import android.widget.Toast

/** shows a toast message. */
fun Context.toast(message: String) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
