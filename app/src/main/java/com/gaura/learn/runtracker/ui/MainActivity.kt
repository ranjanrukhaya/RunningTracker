package com.gaura.learn.runtracker.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gaura.learn.runtracker.R
import com.gaura.learn.runtracker.db.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDAO: RunDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
