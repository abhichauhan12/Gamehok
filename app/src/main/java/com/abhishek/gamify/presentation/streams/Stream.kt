package com.abhishek.gamify.presentation.streams

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.abhishek.gamify.presentation.navigation.Screen
import com.abhishek.gamify.presentation.tournamentdetails.TabView
import com.abhishek.gamify.presentation.tournamentdetails.TournamentDetail

@Preview
@Composable
fun Stream(){


    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = "Streaming Screen Coming soon ", fontSize = 24.sp , color = Color.White)
    }

}

