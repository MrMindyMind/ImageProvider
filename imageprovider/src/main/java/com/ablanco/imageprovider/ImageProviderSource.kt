package com.ablanco.imageprovider

/**
 * Created by Álvaro Blanco Cabrero on 16/09/2018.
 * ImageProvider.
 */
interface ImageProviderSource {

    fun getImage(callback: (ImageProviderResult) -> Unit)
}