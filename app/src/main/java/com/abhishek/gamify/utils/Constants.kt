package com.abhishek.gamify.utils

import androidx.compose.ui.graphics.Color
import com.abhishek.gamify.R
import com.abhishek.gamify.ui.theme.Green
import com.abhishek.gamify.ui.theme.Orange
import com.abhishek.gamify.ui.theme.Peach

data class People(val name: String, val imageRes: Int)

val peopleList = listOf(
    People("Lengend gamer 1", R.drawable.p1),
    People("Alpha one", R.drawable.p2),
    People("Ap legend", R.drawable.p3),
    People("Rozz", R.drawable.p4),
    People("Big Chill", R.drawable.p5)
)


data class Game(val name: String, val imageRes: Int)

val GameList = listOf(
    People("Pubg", R.drawable.pubg),
    People("Apex Legends", R.drawable.apex),
    People("Valorant", R.drawable.valorant),
    People("Call of Duty", R.drawable.cod),
    People("Battlefield V", R.drawable.battlefield),
    People("Counter Stricks", R.drawable.cs),
)


data class Event(val name: String, val imageRes: Int , val data : String , val entryCoin : String)

val eventList = listOf(
    Event("PUBG Tournament By Red Bull", imageRes =  R.drawable.pubg , data = "Jun 26 - Jun 27, 2024" , entryCoin = "Entry - 10"),
    Event("Apex Legends By Red Bull", R.drawable.apex , data = "Jul 03 - Jul 07, 2024" , entryCoin = "Entry - 40"),
    Event("Valorant By Red Bull", R.drawable.valorant , data = "Jul 06 - Jul 13, 2024" , entryCoin = "Entry - 20"),
    Event("Call of Duty", R.drawable.cod , data = "Jun 16 - Jul 7, 2024" , entryCoin = "Entry - 50"),
    Event("Battlefield V", R.drawable.battlefield , data = "Jun 26 - Jun 27, 2024" , entryCoin = "Entry - 10"),
)

val bannerImages = listOf(
    R.drawable.banner_a,
    R.drawable.banner_c,
    R.drawable.valorant,

)

data class Tournaments(
    val name : String ,
    val gameType : String ,
    val gameTag :String,
    val entry : String,
    val time : String,
    val prize : String,
    val eventType : String,
    val typeColor : Color

)

val myTournamentList = listOf(
    Tournaments(name = "PUBG Tournament" ,
        gameType = "SOLO",
        entry = "Entry-10",
        time = "Starts 3rd Aug at 10:00 pm",
        prize = "1000",
        gameTag = "BGMI",
        eventType = "Upcoming",
        typeColor = Peach),

    Tournaments(name = "Valorant Tournament" ,
        gameType = "TEAM",
        entry = "Entry-50",
        gameTag = "VALO",
        time = "Starts 7rd Aug at 11:00 pm",
        prize = "5000",
        eventType = "Upcoming",
        typeColor = Peach),

    Tournaments(name = "PUBG Tournament" ,
        gameType = "SOLO",
        entry = "Entry-10",
        time = "Starts 1rd Aug at 10:00 pm",
        gameTag = "BGMI",
        prize = "1000",
        eventType = "Ongoing",
        typeColor = Orange),

    Tournaments(name = "Valorant Tournament" ,
        gameType = "SOLO",
        entry = "Entry-10",
        gameTag = "VALO",
        time = "Starts 1rd Aug at 10:00 pm",
        prize = "2000",
        eventType = "Ongoing",
        typeColor = Orange),

    Tournaments(name = "PUBG Tournament" ,
        gameType = "SOLO",
        entry = "Entry-10",
        time = "Starts 17th Jul at 10:00 pm",
        gameTag = "BGMI",
        prize = "1000",
        eventType = "Completed",
        typeColor = Green),

    Tournaments(name = "PUBG Tournament" ,
        gameType = "SOLO",
        entry = "Entry-10",
        time = "Starts 10th Jul at 10:00 pm",
        gameTag = "BGMI",
        prize = "1000",
        eventType = "Completed",
        typeColor = Green),


    Tournaments(name = "Valorant Tournament" ,
        gameType = "TEAM",
        entry = "Entry-50",
        gameTag = "VAlO",
        time = "Starts 8th Aug at 10:00 pm",
        prize = "10000",
        eventType = "Completed",
        typeColor = Green),

    Tournaments(name = "PUBG Tournament" ,
        gameType = "SOLO",
        entry = "Entry-10",
        gameTag = "BGMI",
        time = "Starts 3rd Apr at 10:00 pm",
        prize = "1000",
        eventType = "Completed",
        typeColor = Green),


    Tournaments(name = "Valorant Tournament" ,
        gameType = "SOLO",
        entry = "Entry-10",
        gameTag = "VALO",
        time = "Starts 3rd Apr at 10:00 pm",
        prize = "3000",
        eventType = "Completed",
        typeColor = Green),


    )

data class PeopleInTournament(val name : String, val rank : String , val imageRes: Int)

val peopleInTournament = listOf(
    PeopleInTournament(name = "legend gamer", rank = "Gamehok Rank - 14", imageRes = R.drawable.p3),
    PeopleInTournament(name = "Apla gamer", rank = "Gamehok Rank - 141", imageRes = R.drawable.p2),
    PeopleInTournament(name = "apex ff", rank = "Gamehok Rank - 1433", imageRes = R.drawable.p1),
    PeopleInTournament(name = "legend swdf", rank = "Gamehok Rank - 114", imageRes = R.drawable.p5),
    PeopleInTournament(name = "aplha one ", rank = "Gamehok Rank - 45", imageRes = R.drawable.p4),
    PeopleInTournament(name = "sigma gamer", rank = "Gamehok Rank - 64", imageRes = R.drawable.p1),
    PeopleInTournament(name = "beta gamer", rank = "Gamehok Rank - 983", imageRes = R.drawable.p2),
    PeopleInTournament(name = "omega gamer", rank = "Gamehok Rank - 2214", imageRes = R.drawable.p5),
    PeopleInTournament(name = "sova gamer", rank = "Gamehok Rank - 4146", imageRes = R.drawable.p3),
    PeopleInTournament(name = "nu gamer", rank = "Gamehok Rank - 9414", imageRes = R.drawable.p4),
    PeopleInTournament(name = "timertwing gamer", rank = "Gamehok Rank - 5314", imageRes = R.drawable.p1),
    PeopleInTournament(name = "yoy gamer", rank = "Gamehok Rank - 1784", imageRes = R.drawable.p2),
    PeopleInTournament(name = "apex gamer", rank = "Gamehok Rank - 134", imageRes = R.drawable.p3),
    PeopleInTournament(name = "omen gamer", rank = "Gamehok Rank - 3314", imageRes = R.drawable.p5),

    )













