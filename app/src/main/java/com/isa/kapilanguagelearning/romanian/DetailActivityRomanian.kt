package com.isa.kapilanguagelearning.romanian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.isa.kapilanguagelearning.R

class DetailActivityRomanian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_romanian)

        val image = intent.getParcelableExtra<ImageRomanian>(VisitablePlacesRomanianActivity.INTENT_PARCELABLE)

        val imgSource = findViewById<ImageView>(R.id._imageDetail_romanian)
        val imgTitle = findViewById<TextView>(R.id._imageTitle_romanian)
        val imgDescription = findViewById<TextView>(R.id._imageDescription_romanian)

        if (image != null) {
            imgSource.setImageResource(image.imageSourceRomanian)
        }
        if (image != null) {
            imgTitle.text = image.imageTitleRomanian
        }
        if (image != null) {
            imgDescription.text = image.imageDescriptionRomanian
        }
    }
}