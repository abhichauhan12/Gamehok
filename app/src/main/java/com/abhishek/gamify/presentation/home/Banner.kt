package com.abhishek.gamify.presentation.home

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.with
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abhishek.gamify.R


@Preview
@Composable
fun BannerPlaceHolder(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(180.dp)
        .background(color = Color.DarkGray, RoundedCornerShape(8.dp))
    ) {


    }

    Spacer(modifier = Modifier.height(16.dp))

}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AutoSlidingBannerWithIndicator(bannerImages: List<Int>) {
    var currentIndex by remember { mutableStateOf(0) }

    LaunchedEffect(currentIndex) {
        kotlinx.coroutines.delay(5000L)
        currentIndex = (currentIndex + 1) % bannerImages.size
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally, // Center the banner and indicator
        modifier = Modifier.fillMaxWidth()
    ) {
        // Banner Image

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(16.dp))
        ) {
//            Image(
//                painter = painterResource(id = bannerImages[currentIndex]),
//                contentDescription = "Banner Image",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier.height(180.dp)
//            )

            AnimatedContent(
                targetState = currentIndex,
                transitionSpec = {
                    slideInHorizontally(initialOffsetX = { fullWidth -> fullWidth }) + fadeIn() with
                            slideOutHorizontally(targetOffsetX = { fullWidth -> -fullWidth }) + fadeOut()
                }
            ) { targetIndex ->
                Image(
                    painter = painterResource(id = bannerImages[targetIndex]),
                    contentDescription = "Banner Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }



        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .padding(bottom = 16.dp)
        ) {
            bannerImages.forEachIndexed { index, _ ->
                IndicatorDot(isSelected = index == currentIndex)
                Spacer(modifier = Modifier.size(8.dp))
            }
        }
    }
}

//@Preview
@Composable
fun IndicatorDot(isSelected: Boolean) {
//    val isSelected: Boolean = true
    val color = if (isSelected) Color.White else Color.LightGray
    Box(
        modifier = Modifier
            .size(8.dp)
            .clip(RoundedCornerShape(100))
            .background(color)
    )
}