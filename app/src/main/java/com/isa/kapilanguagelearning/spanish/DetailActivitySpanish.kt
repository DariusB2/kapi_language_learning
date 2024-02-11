package com.isa.kapilanguagelearning.spanish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.isa.kapilanguagelearning.R

class DetailActivitySpanish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_spanish)

        val image = intent.getParcelableExtra<ImageSpanish>(VisitablePlacesSpanishActivity.INTENT_PARCELABLE)

        val imgSource = findViewById<ImageView>(R.id._imageDetailSpanish)
        val imgTitle = findViewById<TextView>(R.id._imageTitleSpanish)
        val imgDescription = findViewById<TextView>(R.id._imageDescriptionSpanish)

        if (image != null) {
            imgSource.setImageResource(image.imageSourceSpanish)
        }
        if (image != null) {
            imgTitle.text = image.imageTitleSpanish
        }
        if (image != null) {
            imgDescription.text = image.imageDescriptionSpanish
        }
    }
}