package com.senac.exercicio6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookScreen()
        }
    }
}

@Composable
fun BookScreen() {

    Scaffold { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
                .fillMaxSize()
        ) {

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Row(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Box(
                        modifier = Modifier
                            .size(90.dp)
                            .background(Color.LightGray)
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(
                        modifier = Modifier.weight(1f)
                    ) {

                        Text(
                            text = "The Silkworm",
                            fontSize = 20.sp
                        )

                        Text(
                            text = "Robert Galbraith",
                            fontSize = 14.sp,
                            color = Color.Gray
                        )

                        Text(
                            text = "June 19, 2014",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Button(onClick = {}) {
                            Text("READ")
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                IconCircle(Icons.Default.Star, "4.0")
                IconCircle(Icons.Default.Search, "Reviews")
                IconCircle(Icons.Default.ThumbUp, "Similar")

            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Private investigator Cormoran Strike returns in a new mystery from Robert Galbraith, author of the #1 international bestseller The Cuckoo's Calling.",
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "READ MORE",
                color = Color.Blue,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun IconCircle(icon: androidx.compose.ui.graphics.vector.ImageVector, text: String) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .background(Color(0xFF2196F3)),
            contentAlignment = Alignment.Center
        ) {

            Icon(
                imageVector = icon,
                contentDescription = "",
                tint = Color.White
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(text)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBookScreen() {
    BookScreen()
}