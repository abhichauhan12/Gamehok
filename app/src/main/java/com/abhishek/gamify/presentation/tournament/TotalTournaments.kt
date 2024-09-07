package com.abhishek.gamify.presentation.tournament

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun TotalTournaments(){

    Spacer(modifier = Modifier.size(28.dp))

    val gradientBackground = Brush.horizontalGradient(
        colors = listOf(
            Color(0xFF1B2A1D)  ,
            Color(0xFF2C3E2F),
        )
    )


    Column (modifier = Modifier
//        .height(120.dp)
        .fillMaxWidth()
        .background(gradientBackground, RoundedCornerShape(16.dp))
    ){

        Text(text = "Total Tournaments - 47",
            color = Color.White, fontSize = 28.sp , fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, start = 24.dp , bottom = 30.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp, bottom = 32.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {

            Column {
                Text(
                    modifier = Modifier.padding(),
                    text = "Won",
                    color = Color.White.copy(alpha = 0.5f), fontSize = 20.sp,
                )

                Spacer(modifier = Modifier.size(16.dp))
                Text(
                    text = "06",
                    color = Color.White, fontSize = 20.sp , fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding()
                )
            }

            Column {
                Text(
                    text = "Top 3",
                    color = Color.White.copy(alpha = 0.5f), fontSize = 20.sp,
                    modifier = Modifier.padding()
                )
                Spacer(modifier = Modifier.size(16.dp))

                Text(
                    text = "12",
                    color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding()
                )
            }

            Column {
                Text(
                    text = "Rank (3-10)",
                    color = Color.White.copy(alpha = 0.5f), fontSize = 20.sp,
                    modifier = Modifier.padding()
                )
                Spacer(modifier = Modifier.size(16.dp))

                Text(
                    text = "17",
                    color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding()
                )
            }

            Column {
                Text(
                    text = "Lost",
                    color = Color.White.copy(alpha = 0.5f), fontSize = 20.sp,
                    modifier = Modifier.padding()
                )
                Spacer(modifier = Modifier.size(16.dp))

                Text(
                    text = "03",
                    color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding()
                )
            }


        }
    }
}

