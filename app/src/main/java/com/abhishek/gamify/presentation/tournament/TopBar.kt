package com.abhishek.gamify.presentation.tournament

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.abhishek.gamify.R

@Preview
@Composable
fun TopBar(){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Row(modifier = Modifier ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){

            Image(painterResource(id = R.drawable.trophy )  ,
                contentDescription ="Trophy" , modifier = Modifier.size(36.dp))

            Spacer(modifier = Modifier.size(4.dp))

            Text(text = "My Tournaments" , fontSize = 20.sp , color = Color.White )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Row(modifier = Modifier
                .background(Color.DarkGray, RoundedCornerShape(50))
                .border(1.dp, Color.White, RoundedCornerShape(50))
                .clickable { }
                .padding(4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Image(
                    painterResource(id = R.drawable.coin) ,
                    contentDescription ="" ,
                    modifier = Modifier.size(32.dp))

                Spacer(modifier = Modifier.size(12.dp))

                Text(text = "2956", fontSize = 20.sp , color = Color.White )

                Spacer(modifier = Modifier.size(8.dp))

            }

            Spacer(modifier = Modifier.size(8.dp))

            Icon(imageVector = Icons.Filled.Notifications,
                contentDescription ="" ,
                tint = Color.White ,
                modifier = Modifier
                    .size(40.dp))


        }



    }


}
