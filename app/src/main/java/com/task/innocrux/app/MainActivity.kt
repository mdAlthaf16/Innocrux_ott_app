package com.task.innocrux.app

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.task.innocrux.features.moviedetail.presentation.screen.MovieDetailScreen
import com.task.innocrux.ui.theme.InnocruxTheme

class MainActivity : ComponentActivity() {
    @SuppressLint( "SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        setContent {
            InnocruxTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MovieDetailScreen(innerPadding.calculateBottomPadding())
                }
            }
        }
    }
}

