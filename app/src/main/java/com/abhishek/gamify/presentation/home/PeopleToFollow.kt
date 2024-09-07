package com.abhishek.gamify.presentation.home

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abhishek.gamify.R
import com.abhishek.gamify.utils.People
import com.abhishek.gamify.utils.peopleList

@Preview
@Composable
fun PeopleToFollow() {

    val context = LocalContext.current


    Column {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 16.dp),
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "People to follow",
                color = Color.White,
                fontSize = 24.sp
            )

            Text(text = "View More", color = Color.Green, fontSize = 16.sp, modifier = Modifier.clickable {
                Toast.makeText(context, "coming soon", Toast.LENGTH_SHORT).show()
            })
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxWidth() // Using Column instead of LazyColumn
        ) {
            peopleList.forEach { people ->
                PeopleCard(people)
            }
        }
    }
}

//@Preview
@Composable
fun PeopleCard(people: People){

    val context = LocalContext.current

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(50.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
        ){
            Row(verticalAlignment = Alignment.CenterVertically){

                Image(painterResource(people.imageRes)  ,
                    contentDescription = "User" ,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(100)),
                    contentScale = ContentScale.Crop
                    )

                Spacer(modifier = Modifier.size(16.dp))
                
                Text(text = people.name , color = Color.White , fontSize = 16.sp)

            }

        Button(
            onClick = { Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF0D1F12) // Dark green color
            ),
            modifier = Modifier
                .width(100.dp)
                .height(48.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = "Follow",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )
        }

        }

}











