package com.abhishek.gamify.presentation.tournament

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun SearchAndCreateUI() {
    var searchText by remember { mutableStateOf("") }

    Spacer(modifier = Modifier.size(28.dp))

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        // Search Box

        OutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it },
            placeholder = {
                Text(text = "Search", color = Color.Gray , fontSize = 22.sp)
            },
            leadingIcon = {
                Icon(Icons.Default.Search, contentDescription = "Search Icon",
                    tint = Color.White ,
                    modifier = Modifier.size(32.dp)
                )
            },
            trailingIcon = {
//                Spacer(modifier = Modifier.fillMaxHeight().width(2.dp).background(Color.Green))
//                Icon(Icons.Filled.Notifications, contentDescription = "Filter Icon", tint = Color.White)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(end = 16.dp)
                ) {
                    // Divider Line
                    Box(
                        modifier = Modifier
                            .width(2.dp)
                            .height(36.dp)
                            .background(Color.White)
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    // Filter Icon
                    Icon(Icons.Default.LocationOn, contentDescription = "Filter Icon", tint = Color.White,
                        modifier = Modifier.size(32.dp)
                    )
                }

            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Gray,
                unfocusedBorderColor = Color.Gray,
                focusedTextColor = Color.White,
                cursorColor = Color.White
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .weight(1f)
                .height(60.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

        // Create Button
        Button(
            onClick = { /* Handle create action */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF00C853)
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .height(60.dp)
        ) {
            Text(
                text = "+Create",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }


    }

    Spacer(modifier = Modifier.size(28.dp))

}
