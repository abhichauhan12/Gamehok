package com.abhishek.gamify.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abhishek.gamify.utils.bannerImages


@Preview
@Composable
fun Home(){

    val gradientBackground = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF000000),
            Color(0xFF03130A),

        )
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(gradientBackground)
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
    ) {
        item{ TopBar() }
        item{ AutoSlidingBannerWithIndicator(bannerImages) }
        item{ PlayTournamentByGame() }
        item{ CompeteInBattle() }
        item{ PeopleToFollow() }


    }

}

