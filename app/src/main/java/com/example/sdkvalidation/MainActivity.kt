package com.example.sdkvalidation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.andresrubianoch.androidcore.sdkVersion.SdkVersionStrategy
import com.andresrubianoch.androidcore.sdkVersion.SdkVersionStrategyImpl
import com.example.sdkvalidation.ui.theme.SdkValidationTheme

class MainActivity : ComponentActivity() {

    private val sdkVersion: SdkVersionStrategy by lazy {
        SdkVersionStrategyImpl()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sdkText = if (sdkVersion.isAtLeastSnowCone()) {
            "This build version is at least Snow Cone"
        } else {
            "This build version is minor than Snow cone"
        }
        setContent {
            SdkValidationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(sdkText)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SdkValidationTheme {
        Greeting("Android")
    }
}