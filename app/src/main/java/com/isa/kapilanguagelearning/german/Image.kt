package com.isa.kapilanguagelearning.german

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image (
    val imageSource : Int,
    val imageTitle : String,
    val imageDescription : String) : Parcelable