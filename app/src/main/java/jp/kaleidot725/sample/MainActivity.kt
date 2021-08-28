package jp.kaleidot725.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import jp.kaleidot725.sample.ui.screen.OneScreen
import jp.kaleidot725.sample.ui.screen.TwoScreen
import jp.kaleidot725.sample.ui.theme.SampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            SampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NavHost(navController, startDestination = "one") {
                        composable("one") {
                            OneScreen()
                        }
                        composable("two") {
                            TwoScreen()
                        }
                    }
                }
            }
        }
    }
}
