package com.abhishek.gamify.presentation.home

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abhishek.gamify.R
import com.abhishek.gamify.ui.theme.Peach


@Preview
@Composable
fun PlayTournamentByGame(){

    val context = LocalContext.current

    Column {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.SpaceBetween ,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Play Tournament by Games" ,
                color = Color.White ,
                fontSize = 20.sp)
            Text(text = "View All" , color = Color.Green , fontSize = 16.sp , modifier = Modifier.clickable {
                Toast.makeText(context, "coming soon", Toast.LENGTH_SHORT).show()
            })
        }

        Spacer(modifier = Modifier.height(16.dp))
        GameGrid()
        Spacer(modifier = Modifier.height(8.dp))

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(2.dp)
            .background(Color.DarkGray))

        Spacer(modifier = Modifier.height(16.dp))

        CreateYourTournament()

    }


}


//@Composable
//fun GameGrid() {
//    val games = listOf(
//        Game("PUBG", R.drawable.valorant),
//        Game("Valorant", R.drawable.valorant),
//        Game("Apex Legends", R.drawable.valorant),
//        Game("Call of Duty", R.drawable.valorant),
//        Game("Counter Strike", R.drawable.valorant),
//        Game("PUBG", R.drawable.valorant)
//    )
//
//    LazyVerticalGrid(
//        columns = GridCells.Fixed(3),
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(280.dp),
//        verticalArrangement = Arrangement.spacedBy(8.dp),
//        horizontalArrangement = Arrangement.spacedBy(8.dp)
//    ) {
//        items(games) { game ->
//            GameCard(game)
//        }
//    }
//}
//
//
//@Composable
//fun GameCard(game: Game) {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center,
//            modifier = Modifier.fillMaxSize()
//        ) {
//            Image(
//                painter = painterResource(game.imageRes),
//                contentDescription = game.name,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(90.dp)
//                    .clip(RoundedCornerShape(16.dp)),
//                contentScale = ContentScale.Crop
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                text = game.name,
//                fontSize = 16.sp,
//                color = Color.White,
//                modifier = Modifier.padding(4.dp)
//            )
//        }
//}

@Composable
fun GameGrid() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // First Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            GameItem(imageResId = R.drawable.pubg, gameTitle = "PUBG")
            GameItem(imageResId = R.drawable.valorant, gameTitle = "Valorant")
            GameItem(imageResId = R.drawable.apex, gameTitle = "Apex Legends")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Second Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            GameItem(imageResId = R.drawable.cod, gameTitle = "Call of Duty")
            GameItem(imageResId = R.drawable.cs, gameTitle = "Counter Strike")
            GameItem(imageResId = R.drawable.battlefield, gameTitle = "BattleField V")
        }
    }
}

@Composable
fun GameItem(imageResId: Int, gameTitle: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(120.dp)
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = gameTitle,
            modifier = Modifier
                .height(100.dp)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = gameTitle,
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}



@Preview
@Composable
fun CreateYourTournament(){
    Row (modifier = Modifier
        .fillMaxWidth()
        .background(Peach, RoundedCornerShape(8.dp))
        .padding(24.dp)
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Column( modifier = Modifier
        ) {
            Text(text = "Create your own tournaments" ,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold
                ) ,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Host and manage your own tournaments \nand play with friends" ,
                color = Color.DarkGray ,
                style = MaterialTheme.typography.bodySmall,
                )
        }

        Image(painterResource(id = R.drawable.game_controller)  ,
            contentDescription = "Game Controller" ,
            modifier = Modifier
                .padding(end = 16.dp)
                .width(60.dp)
                .height(54.dp)
        )

    }

}