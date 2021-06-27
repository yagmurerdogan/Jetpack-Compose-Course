package com.yagmurerdogan.simpletextcomposeapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yagmurerdogan.simpletextcomposeapplication.ui.theme.SimpleTextComposeApplicationTheme

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
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .size(width = 80.dp, height = 240.dp)
            //.fillMaxWidth(0.5f)
            //.fillMaxHeight()
            //.fillMaxSize()
    )
}

@Composable
fun GreetingButton() {
    val context = LocalContext.current
    Button(onClick = {
        Toast.makeText(context, "You clicked me!", Toast.LENGTH_SHORT).show()
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