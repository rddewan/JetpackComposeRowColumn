package com.example.jetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContent {
            Column {
                Column(
                    modifier = Modifier
                        .padding(start = 0.dp,top = 8.dp,0.dp,0.dp)
                        .fillMaxWidth()
                        .height(100.dp)
                        .border(
                            border = BorderStroke(
                                width = 1.dp,
                                color = Color.Green
                            )
                        ),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Column 1", modifier = Modifier.align(Alignment.CenterHorizontally))
                    Text(text = "Column 2", modifier = Modifier.align(Alignment.CenterHorizontally))
                }

                Spacer(modifier = Modifier.padding(8.dp))

                Row(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .fillMaxWidth()
                        .height(100.dp)
                        .border(
                            border = BorderStroke(
                                width = 1.dp,
                                color = Color.Blue
                            )
                        ),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 0.dp,0.dp,8.dp,0.dp)
                            .align(Alignment.CenterVertically)
                            .border(
                            border = BorderStroke(
                                width = 1.dp,
                                color = Color.Green
                            )
                        )
                    ) {
                        Text(
                            text = "Column 1",
                        )

                    }
                    Column(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .border(
                            border = BorderStroke(
                                width = 1.dp,
                                color = Color.Green
                            )
                        )
                    ) {
                        Text(text = "Column 2")

                    }

                }
            }
        }*/
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .background(color = Color(0xFFF2F2F2))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = "Happy Mean",
                    modifier = Modifier.height(300.dp).fillMaxWidth(),
                    alignment = Alignment.Center,
                    contentScale = ContentScale.Crop
                )

                Column(modifier = Modifier.padding(16.dp).align(Alignment.Start)) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Happy Meal",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        )
                        Text(
                            text = "$100",
                            style = TextStyle(
                                color = Color.Blue,
                                fontSize = TextUnit.Companion.Unspecified
                            ),
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }


                    Spacer(modifier = Modifier.padding(8.dp))
                    Text(
                        text = "25 Calories",
                        modifier = Modifier.align(Alignment.Start),
                        color = Color.Green,
                        fontSize = 16.sp
                    )
                    Text(
                        text = "20 Calories",
                        modifier = Modifier.align(Alignment.Start),
                        color = Color.Red,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.padding(8.dp))

                    Button(onClick = {},modifier = Modifier.align(Alignment.CenterHorizontally)){
                        Text(text = "Order NOw!")
                    }
                }

            }
        }


    }


    @Composable
    fun greeting(name: String) {
        Text(text = "Hello $name")
    }
}