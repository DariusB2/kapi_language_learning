package com.isa.kapilanguagelearning.general

import android.app.Activity
import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import com.isa.kapilanguagelearning.R
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity()
{
    private lateinit var filepath : Uri

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        button_select_photo.setOnClickListener {
            startFileChooser()
        }

        button_upload_photo.setOnClickListener {
            uploadFile()
        }
    }

    private fun startFileChooser()
    {
        val i = Intent()
        i.type = "image/*"
        i.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(i, "Choose Picture"),111)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==111 && resultCode == Activity.RESULT_OK && data != null)
        {
            filepath = data.data!!
            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, filepath)
            image_view_profile.setImageBitmap(bitmap)
        }
    }
    private fun uploadFile()
    {
        val pd = ProgressDialog(this)
        pd.setTitle("Uploading")
        pd.show()

        val imageRef = FirebaseStorage.getInstance().reference.child("images/pic.jpg")
        imageRef.putFile(filepath)
            .addOnSuccessListener { p0 ->
                pd.dismiss()
                Toast.makeText(applicationContext, "File Uploaded", Toast.LENGTH_LONG).show()
            }
            .addOnFailureListener { p0 ->
                pd.dismiss()
                Toast.makeText(applicationContext, p0.message, Toast.LENGTH_LONG).show()
            }
            .addOnProgressListener { p0 ->
                val progress = (100.0 * p0.bytesTransferred) /p0.totalByteCount
                pd.setMessage("Uploaded ${progress.toInt()}%")
            }

    }
}