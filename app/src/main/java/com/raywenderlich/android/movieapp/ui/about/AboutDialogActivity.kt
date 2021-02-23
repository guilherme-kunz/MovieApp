package com.raywenderlich.android.movieapp.ui.about

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raywenderlich.android.movieapp.R
import kotlinx.android.synthetic.main.activity_dialog.*

class AboutDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        okButton.setOnClickListener { finish() }
    }
}
