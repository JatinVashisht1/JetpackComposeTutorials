package com.example.basicsofjetpackcompose

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basicsofjetpackcompose.ui.theme.BasicsOfJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsOfJetpackComposeTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // make reusable composables whenever possible
                     val nameList = listOf("Rahul", "Ankit", "Nitin",)
                    Greeting(names = nameList)
                }
            }
        }
    }
}

@Composable
fun Greeting(names: List<String>) {
    // Text is equivalent to text view in xml
    Surface(
        color = MaterialTheme.colors.primary
    ) {
//        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally) {
//            for (name in names) {
//                Text(text = "Hello $name!",)
//            }
//        }
//        Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
//            for(name in names){
//                Text(text = "Hello $name")
//            }
//        }
        Box(modifier = Modifier.fillMaxSize()) {
            for(name in names){
                Text(text = "Hello $name")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicsOfJetpackComposeTheme {
        Greeting(listOf("Rahul", "Ankit", "Nitin",))
    }
}

// Column -> Linear layout of xml (vertical orientation)
// Row -> Linear layout of xml (horizontal orientation)
// Box -> Frame layout of xml
// modifier (fms) -> fills all *available space*
// Alignment and Arrangement
// Column -> vertical -> Arrangement: Vertical -> Alignment -> Horizontal
// Row -> horizontal -> Arrangement: Horizontal -> Alignment -> Vertical