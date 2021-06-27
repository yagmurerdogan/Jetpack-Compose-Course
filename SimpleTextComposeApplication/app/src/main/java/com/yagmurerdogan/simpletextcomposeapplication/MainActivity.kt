package com.yagmurerdogan.simpletextcomposeapplication

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
            setContent(content = {
            Greeting(name = "Thanks for lambda functions")
        })

        ~ Notice that composable function names are starting with upper case

         */
        setContent {
            GreetingText(name = "World!")
        }
    }
}

@Composable
fun GreetingText(name: String) {
    val context = LocalContext.current
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .size(width = 200.dp, height = 240.dp)
            .padding(all = 24.dp)
            //.fillMaxWidth(0.5f)
            //.fillMaxHeight()
            //.fillMaxSize()
            .clickable(onClick = {
                Toast
                    .makeText(context, "Text Clicked!", Toast.LENGTH_SHORT)
                    .show()
            }),
        /*
        style = MaterialTheme.typography.body1,
        fontWeight = FontWeight.SemiBold
         */
        style = TextStyle(
            color = Color.Yellow,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
    )
}

@Composable
fun GreetingButton() {
    val context = LocalContext.current
    Button(onClick = {
        Toast
            .makeText(context, "Button Clicked!", Toast.LENGTH_SHORT)
            .show()
    }) {
        GreetingText(name = "button")
        GreetingText(name = "remaining button")

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingText(name = "World!")

}