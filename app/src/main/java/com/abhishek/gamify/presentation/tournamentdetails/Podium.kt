package com.abhishek.gamify.presentation.tournamentdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
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
import androidx.constraintlayout.compose.ConstraintLayout
import com.abhishek.gamify.R
import com.abhishek.gamify.ui.theme.DarkGreen
import com.abhishek.gamify.ui.theme.Green
import com.abhishek.gamify.ui.theme.Orange
import com.abhishek.gamify.ui.theme.Peach
import com.abhishek.gamify.utils.PeopleInTournament
import com.abhishek.gamify.utils.peopleInTournament

@Preview
@Composable
fun StandingsContent() {

    Box(modifier = Modifier){
        Column(modifier = Modifier.padding(bottom = 64.dp))
        {
            LazyColumn {
                item { Podium() }
                items(peopleInTournament) { people ->
                    PeopleCard(people)
                }
            }
        }
        Box(modifier = Modifier.align(Alignment.BottomStart)){
            JoinTournament()
        }
    }

}

@Preview
@Composable
fun JoinTournament() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(Green, RoundedCornerShape(12.dp)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Text(
            text = "Join Tournament",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

    }
}

@Preview
@Composable
fun Podium() {

    Spacer(modifier = Modifier.size(24.dp))
    ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
        val(left, main,right) = createRefs()

        // left
        Column(
            modifier = Modifier
            .constrainAs(left){
                end.linkTo(main.start, margin = -16.dp)
                bottom.linkTo(main.bottom)
            }
        ){
            Column(modifier = Modifier
                .offset(-24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(painterResource(id = R.drawable.p1) ,
                    contentDescription = "",
                    Modifier
                        .size(28.dp)
                        .border(width = 2.dp, color = Orange, RoundedCornerShape(100))
                        .clip(RoundedCornerShape(100))
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(text = "Legend Gamer", fontSize = 12.sp , color = Color.White )
                Text(text = "G Rank - 1123", fontSize = 12.sp , color = Color.White )
            }

            Spacer(modifier = Modifier.size(8.dp))
            Image(painterResource(id = R.drawable.pod_left )  ,
                contentDescription = "" ,
                modifier = Modifier
            )

        }

        //main
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            modifier = Modifier
            .constrainAs(main){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        ){
            Column(modifier = Modifier ,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(painterResource(id = R.drawable.p2) ,
                    contentDescription = "",
                    Modifier
                        .size(36.dp)
                        .border(width = 2.dp, color = Color.Yellow, RoundedCornerShape(100))
                        .clip(RoundedCornerShape(100))
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(text = "Apex one", fontSize = 16.sp , color = Color.White )
                Text(text = "G Rank - 23", fontSize = 16.sp , color = Color.White )
            }

            Spacer(modifier = Modifier.size(8.dp))

            Image(painterResource(id = R.drawable.pod_main )  ,
                contentDescription = "" ,
                modifier = Modifier
            )


        }

        //right
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
            .constrainAs(right){
                start.linkTo(main.end, margin = -14.dp)
                bottom.linkTo(main.bottom)
            }
        ){
            Column(modifier = Modifier
                .offset(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(painterResource(id = R.drawable.p3) ,
                    contentDescription = "",
                    Modifier
                        .size(24.dp)
                        .border(width = 2.dp, color = Peach, RoundedCornerShape(100))
                        .clip(RoundedCornerShape(100))
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(text = "Alpha one", fontSize = 12.sp , color = Color.White )
                Text(text = "G Rank - 113", fontSize = 12.sp , color = Color.White )
            }

            Spacer(modifier = Modifier.size(8.dp))

            Image(painterResource(id = R.drawable.pod_right )  ,
                contentDescription = "" ,
                modifier = Modifier
            )


        }


    }

}


//@Preview
@Composable
fun PeopleCard(people: PeopleInTournament){

    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp, horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(people.imageRes),
                    contentDescription = "Profile Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(100.dp))
                )

                Spacer(modifier = Modifier.width(8.dp))

                Column {
                    Text(
                        text =people.name,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = people.name,
                        fontSize = 12.sp,
                        color = Color.White
                    )
                }
            }

            // Stats Button (Right side)
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(DarkGreen) // Dark green background color
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    // Icon (Use your own icon or any vector image)
                    Icon(
                        painter = painterResource(id = R.drawable.rank), // Replace with your icon
                        contentDescription = "Stats Icon",
                        tint = Color(0xFFE87C58), // Orange color
                        modifier = Modifier.size(16.dp)
                    )

                    Spacer(modifier = Modifier.width(4.dp))

                    // Stats Text
                    Text(
                        text = "04",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.width(4.dp))

                }
            }
        }



        Box(modifier = Modifier
            .height(2.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .background(Color.DarkGray)
        )
    }



}

