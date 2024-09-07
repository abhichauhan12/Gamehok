package com.abhishek.gamify.presentation.home

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abhishek.gamify.R
import com.abhishek.gamify.utils.Event
import com.abhishek.gamify.utils.eventList

@Preview
@Composable
fun CompeteInBattle(){

    val context = LocalContext.current

    Column {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 16.dp)
            ,
            horizontalArrangement = Arrangement.Absolute.SpaceBetween ,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Compete In Battles" ,
                color = Color.White ,
                fontSize = 24.sp)

            Text(text = "View All" , color = Color.Green , fontSize = 16.sp, modifier = Modifier.clickable {
                Toast.makeText(context, "coming soon", Toast.LENGTH_SHORT).show()
            })
        }

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
//            item(){ TournamentCard() }
//            item(){ TournamentCard() }
//            item(){ TournamentCard() }
//            item(){ TournamentCard() }
            eventList.forEach { event ->
                item { TournamentCard(event) }

            }

        }

    }
}


//@Preview
@Composable
fun TournamentCard(event: Event) {
    Box(
        modifier = Modifier
            .width(300.dp)
            .border(0.5.dp, color = Color.White, RoundedCornerShape(8.dp))
            .background(Color.Black, shape = RoundedCornerShape(8.dp))
    ) {
        Column {
            Box {
                Image(
                    painter = painterResource(event.imageRes),
                    contentDescription = "Tournament Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                        .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)),
                    contentScale = ContentScale.Crop
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    // Registration Open Label
                    Text(
                        text = "Registration Open",
                        color = Color.White,
                        modifier = Modifier
                            .background(
                                Color.Black.copy(alpha = 0.8f),
                                shape = RoundedCornerShape(50)
                            )
                            .padding(horizontal = 8.dp, vertical = 4.dp),
                        style = MaterialTheme.typography.bodySmall
                    )
                    // Prize Label
                    Row(
                        modifier = Modifier
                            .background(
                                Color.Black.copy(alpha = 0.8f),
                                shape = RoundedCornerShape(50)
                            )
                            .padding(horizontal = 8.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Icon(
                            painter = painterResource(id = R.drawable.tournament), // Replace with your icon
                            contentDescription = "Prize",
                            tint = Color.Green,
                            modifier = Modifier
                                .size(16.dp)
                                .alpha(0.7f)
                        )

                        Spacer(modifier = Modifier.width(4.dp))

                        Text(
                            text = "10000",
                            color = Color.White,
                            style = MaterialTheme.typography.bodySmall
                        )

                        Spacer(modifier = Modifier.width(4.dp))

                        Image(
                            painter = painterResource(id = R.drawable.coin), // Replace with your icon
                            contentDescription = "Prize",
                            modifier = Modifier.size(16.dp)
                        )

                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Tournament Details
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(
                    text = event.name,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(4.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painterResource(id = R.drawable.calender) ,
                        contentDescription = "Calendar",
                        tint = Color.White,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = event.data,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.White
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically ,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = event.entryCoin,
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Image(
                            painter = painterResource(id = R.drawable.coin), // Replace with your icon
                            contentDescription = "Coins",
                            modifier = Modifier.size(16.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.community),
                            contentDescription = "Players",
                            tint = Color.LightGray,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "670/800",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.White
                        )
                    }

                }


            }

            Spacer(modifier = Modifier.height(16.dp))

            // See Details Button
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "See Tournament Details",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White
                )

                Box(modifier = Modifier
                    .background(Color.Green, RoundedCornerShape(100))
                    .size(28.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
//                    painter = painterResource(id = R.drawable.arrow),
                        imageVector = Icons.Filled.ArrowForward ,
                        contentDescription = "Arrow",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                }

            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
