package com.abhishek.gamify.presentation.tournamentdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abhishek.gamify.R

@Preview
@Composable
fun TabView() {
    var selectedTabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Standings", "Overview", "Rules")

    // Tab Row
    Column {
        TabRow(
            selectedTabIndex = selectedTabIndex,
            containerColor = Color.Black,  // Background color of the tab row
            contentColor = Color.White,     // Color of the selected tab content (text)
            indicator = { tabPositions ->
                SecondaryIndicator(
                    Modifier
                        .tabIndicatorOffset(tabPositions[selectedTabIndex])
                        .height(2.dp),  // Indicator height
                    color = Color.White // Color of the indicator (line below the selected tab)
                )
            }
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    text = {
                        Text(
                            text = title,
                            color = if (selectedTabIndex == index) Color.White else Color.Gray,
                            textAlign = TextAlign.Center
                        )
                    }
                )
            }
        }

        // Display content based on selected tab
        when (selectedTabIndex) {
            0 -> StandingsContent()
            1 -> OverviewContent()
            2 -> RulesContent()
        }
    }
}



@Composable
fun OverviewContent() {
    Text(
        text = "Overview Content",
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        color = Color.White
    )
}

@Composable
fun RulesContent() {
    Text(
        text = "Rules Content",
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        color = Color.White
    )
}



@Preview
@Composable
fun TournamentDetail(){

    Column {

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            ,

        ){

            Image(painterResource(id = R.drawable.valorant)  ,
                contentDescription = "game image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize() )

            Row(modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 16.dp, bottom = 8.dp)
                .background(Color.Black.copy(0.7f), RoundedCornerShape(50))
                .padding(horizontal = 8.dp, vertical = 4.dp)
                ,
                verticalAlignment = Alignment.CenterVertically,

                ){

                Icon(painterResource(id = R.drawable.community)  ,
                    contentDescription = "people",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )

                Spacer(modifier = Modifier.size(8.dp))

                Text(text = "456/600" , color = Color.White)
                Spacer(modifier = Modifier.size(4.dp))

            }

        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp) ,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {

                Text(text = "Pugb Tournament", color = Color.White, fontSize = 28.sp)

                Spacer(modifier = Modifier.size(8.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Text(text = "Entry - 10 ", color = Color.White, fontSize = 20.sp)
                    Spacer(modifier = Modifier.size(4.dp))

                    Image(painterResource(id = R.drawable.coin )  ,
                        contentDescription = "coin",
                        modifier = Modifier.size(20.dp)
                        )
                }

            }

            Image(painterResource(id = R.drawable.redbull )  ,
                contentDescription ="Redbull" ,
                Modifier.size(60.dp)
            )

        }

    }


}