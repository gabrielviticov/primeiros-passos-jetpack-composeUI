package com.alura.aluvery

import android.content.res.Configuration.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alura.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    ProductItem()
                }
            }
        }
    }
}

@Preview(showSystemUi = false, showBackground = true)
@Composable
fun ProductItem(){
    Column {
        Box(modifier = Modifier
            .height(50.dp)
            .width(50.dp)
            .background(Color.Yellow)
        ){

        }
        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null)
        Text(text = "Lorem Ipsum")
        Text(text = "Lorem Ipsum iset udevat hinut dejav")
    }
}