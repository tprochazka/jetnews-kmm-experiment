package cz.atomsoft.kmm.test

import androidx.compose.material.MaterialTheme
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import com.example.jetnews.data.AppContainerImpl
import com.example.jetnews.ui.JetnewsApp
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        val appContainer = AppContainerImpl()
        val widthSizeClass = calculateWindowSizeClass().widthSizeClass
            JetnewsApp(appContainer, widthSizeClass)

    }
}
