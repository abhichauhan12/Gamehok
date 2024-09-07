package com.abhishek.gamify.presentation.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.abhishek.gamify.R

//@Preview
@Composable
fun CustomBottomBar(navController: NavController){

    var selectedButton by remember { mutableStateOf(0) }

    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Black)
        .padding( top = 16.dp , bottom = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically){


        IconButton(
            onClick = {
                navController.navigate(Screen.Home.route)
                selectedButton = 0
            },
            modifier = Modifier
                .size(32.dp)
        ) {
            Icon(
                painterResource(id = R.drawable.home),
                contentDescription = "home" ,
                tint = if(selectedButton == 0) Color.White else Color.Gray )
        }

        IconButton(
            onClick = {
                navController.navigate(Screen.Tournament.route)
                selectedButton = 1
            },
            modifier = Modifier
                .size(32.dp)
        ) {
            Icon(
                painterResource(id = R.drawable.tournament),
                contentDescription = "tournament" ,
                tint = if(selectedButton == 1) Color.White else Color.Gray )
        }

        IconButton(
            onClick = {
                navController.navigate(Screen.Community.route)
                selectedButton = 2
            },
            modifier = Modifier
                .size(32.dp)
        ) {
            Icon(
                painterResource(id = R.drawable.community),
                contentDescription = "community" ,
                tint = if(selectedButton == 2) Color.White else Color.Gray )
        }

        IconButton(
            onClick = {
                navController.navigate(Screen.Stream.route)
                selectedButton = 3
            },
            modifier = Modifier
                .size(32.dp)
        ) {
            Icon(
                painterResource(id = R.drawable.stream),
                contentDescription = "Stream" ,
                tint = if(selectedButton == 3) Color.White else Color.Gray )
        }



    }




}