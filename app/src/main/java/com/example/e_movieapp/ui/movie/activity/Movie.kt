package com.example.e_movieapp.ui.movie.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e_movieapp.R
import dagger.hilt.android.AndroidEntryPoint



@AndroidEntryPoint
class Movie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_activity)
    }
}