package com.isa.kapilanguagelearning.spanish

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ImageSpanish (
    val imageSourceSpanish : Int,
    val imageTitleSpanish : String,
    val imageDescriptionSpanish : String
) : Parcelable