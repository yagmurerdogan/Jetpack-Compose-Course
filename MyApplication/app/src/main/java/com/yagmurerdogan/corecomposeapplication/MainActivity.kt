package com.yagmurerdogan.corecomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

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
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            HorizontalColoredBar(color = Color.Yellow, height = 600.dp, width = 60.dp)
            HorizontalColoredBar(color = Color.Green, height = 600.dp, width = 60.dp)
            HorizontalColoredBar(color = Color.Blue, height = 600.dp, width = 60.dp)
            HorizontalColoredBar(color = Color.LightGray, height = 600.dp, width = 60.dp)
            HorizontalColoredBar(color = Color.Black, height = 600.dp, width = 60.dp)

        }

    }
}

@Composable
fun HorizontalColoredBar(color: Color, height: Dp, width: Dp) {
    Surface(
        color = color,
        modifier = Modifier
            .height(height)
            .width(width)
    ) { }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}