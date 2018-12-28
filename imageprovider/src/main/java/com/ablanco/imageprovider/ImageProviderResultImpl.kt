package com.ablanco.imageprovider

import android.graphics.Bitmap
import android.net.Uri

data class ImageProviderResultImpl(
        override val uri: Uri?,
        override val bitmap: Bitmap?) : ImageProviderResult {

    companion object {
        @JvmStatic
        fun empty() = ImageProviderResultImpl(null, null)
    }

}