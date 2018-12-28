package com.ablanco.imageprovider

import android.graphics.Bitmap
import android.net.Uri

interface ImageProviderResult {

    val uri: Uri?

    val bitmap: Bitmap?

}