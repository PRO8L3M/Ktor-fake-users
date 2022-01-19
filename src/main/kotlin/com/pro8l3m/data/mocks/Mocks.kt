package com.pro8l3m.data.mocks

import com.pro8l3m.data.model.User

const val BASE_URL = "http://peaceful-island-34483.herokuapp.com"

object Mocks {
    val users = mutableListOf(
        User(
            id = 0,
            firstName = "Andrew",
            lastName =  "Gołota",
            yearOfBirth = 1968,
            imageUrl = "$BASE_URL/users/male_avatar.png"
        ),
        User(
            id = 1,
            firstName = "Mike",
            lastName =  "Tyson",
            yearOfBirth = 1966,
            imageUrl = "$BASE_URL/users/male_avatar.png"
        )
    )
}