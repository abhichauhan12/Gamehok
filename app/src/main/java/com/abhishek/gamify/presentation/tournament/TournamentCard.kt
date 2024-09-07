package com.abhishek.gamify.presentation.tournament

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.abhishek.gamify.R
import com.abhishek.gamify.presentation.navigation.Screen
import com.abhishek.gamify.ui.theme.Peach
import com.abhishek.gamify.utils.Tournaments
import com.abhishek.gamify.utils.myTournamentList


//@Preview
@Composable
fun TournamentDetails(navController: NavHostController) {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        myTournamentList.forEach { tournament ->
            TournamentDetailsCard(tournament , navController)
        }
    }
}



//@Preview
@Composable
fun TournamentDetailsCard(tournaments: Tournaments , navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, color = Color.White, shape = RoundedCornerShape(16.dp))
            .clip(RoundedCornerShape(16.dp))
            .clickable {
                navController.navigate(Screen.TournamentDetail.route)
            }
        ,
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            // Header section with title and logo
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column {
                    Text(
                        text = tournaments.name,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "By Red Bull",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                }

                Image(
                    painter = painterResource(id = R.drawable.redbull),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Red Bull Logo",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(100))
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Game Type and Entry Details
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                GameTag(tag = tournaments.gameTag)
                Spacer(modifier = Modifier.size(16.dp))
                GameTag(tag = tournaments.gameType)
                Spacer(modifier = Modifier.size(16.dp))
                GameTag(tag = tournaments.entry , icon = R.drawable.coin)
                Spacer(modifier = Modifier.size(16.dp))

            }

            Spacer(modifier = Modifier.height(16.dp))

            // Time and Prize Details
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.timer),
                    contentDescription = "Clock Icon",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = tournaments.time,
                    color = Color.White,
                    fontSize = 14.sp
                )
            }

            Spacer(modifier = Modifier.height(8.dp))


            Row(modifier = Modifier
                .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween) {


                Row(verticalAlignment = Alignment.CenterVertically) {

                    Image(
                        painter = painterResource(id = R.drawable.trophy),
                        contentDescription = "Trophy Icon",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Prize Pool - " + tournaments.prize,
                        color = Color.White,
                        fontSize = 14.sp
                        )
                    Spacer(modifier = Modifier.width(8.dp))

                    Image(
                        painter = painterResource(R.drawable.coin),
                        contentDescription = "Tag Icon",
                        modifier = Modifier.size(16.dp),
                    )
                }

                Box(modifier = Modifier
                    .background(tournaments.typeColor, RoundedCornerShape(50))
                    .padding(top = 4.dp, bottom = 4.dp, start = 8.dp, end = 8.dp)){
                    Text(
                        text = tournaments.eventType,
                        color = if(tournaments.eventType == "Upcoming") Color.Black else Color.White
                    )

                }

            }

        }
    }
}

@Composable
fun GameTag(tag: String, icon: Int? = null) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(Color(0xFF1B2A1D), RoundedCornerShape(4.dp))
            .padding(horizontal = 12.dp, vertical = 4.dp)
    ) {
        if (icon != null) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = "Tag Icon",
                modifier = Modifier.size(16.dp),
            )
            Spacer(modifier = Modifier.width(4.dp))
        }
        Text(
            text = tag,
            color = Color.White,
            fontSize = 14.sp
        )
    }
}
