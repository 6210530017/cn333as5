package com.example.cn333as5

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.cn333as5.routing.MyNotesRouter
import com.example.cn333as5.routing.Screen
import com.example.cn333as5.screens.NotesScreen
import com.example.cn333as5.screens.SaveNoteScreen
import com.example.cn333as5.ui.theme.AppTheme
import com.example.cn333as5.viewmodel.MainViewModel
import com.example.cn333as5.viewmodel.MainViewModelFactory

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme(darkTheme = false) {
                val viewModel: MainViewModel = viewModel(
                    factory = MainViewModelFactory(LocalContext.current.applicationContext as Application)
                )
                MainActivityScreen(viewModel)
            }
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun MainActivityScreen(viewModel: MainViewModel) {
    Surface {
        when (MyNotesRouter.currentScreen) {
            is Screen.Notes -> NotesScreen(viewModel)
            is Screen.SaveNote -> SaveNoteScreen(viewModel)
        }
    }
}
