package com.pro8l3m.data.mocks

import com.pro8l3m.data.model.User

const val BASE_URL = "http://peaceful-island-34483.herokuapp.com"

object Mocks {
    val avatars = mutableMapOf(
        "Male" to "$BASE_URL/users/male_avatar.png",
        "Female" to "$BASE_URL/users/female_avatar.png"

    )
    val users = mutableListOf(
        User(
            id = 0,
            firstName = "Andrew",
            lastName =  "Gołota",
            yearOfBirth = 1968,
            imageUrl = "${avatars["Male"]}"
        ),
        User(
            id = 1,
            firstName = "Mike",
            lastName =  "Tyson",
            yearOfBirth = 1966,
            imageUrl = "${avatars["Male"]}"
        ),
        User(
            id = 2,
            firstName = "Amanda",
            lastName = "Serrano",
            yearOfBirth = 1988,
            imageUrl = "${avatars["Female"]}"
        )
    )
}