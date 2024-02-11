package com.isa.kapilanguagelearning.romanian

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ImageRomanian (
    val imageSourceRomanian : Int,
    val imageTitleRomanian : String,
    val imageDescriptionRomanian : String) : Parcelable