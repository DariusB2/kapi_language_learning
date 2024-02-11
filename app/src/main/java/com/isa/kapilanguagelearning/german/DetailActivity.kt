package com.isa.kapilanguagelearning.german

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.isa.kapilanguagelearning.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val image = intent.getParcelableExtra<Image>(VisitablePlacesGermanActivity.INTENT_PARCELABLE)

        val imgSource = findViewById<ImageView>(R.id._imageDetail)
        val imgTitle = findViewById<TextView>(R.id._imageTitle)
        val imgDescription = findViewById<TextView>(R.id._imageDescription)

        if (image != null) {
            imgSource.setImageResource(image.imageSource)
        }
        if (image != null) {
            imgTitle.text = image.imageTitle
        }
        if (image != null) {
            imgDescription.text = image.imageDescription
        }
    }
}