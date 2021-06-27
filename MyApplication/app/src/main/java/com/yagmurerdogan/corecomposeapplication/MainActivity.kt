package com.yagmurerdogan.corecomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            color = Color.Yellow,
            modifier = Modifier.wrapContentSize(align = Alignment.BottomCenter)
        ) {
            Text(
                text = "Wrapped content",
                //modifier = Modifier.wrapContentSize(), -> default
                color = Color.Green,
                style = MaterialTheme.typography.h3,
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}