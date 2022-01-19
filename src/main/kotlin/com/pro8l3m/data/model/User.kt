package com.pro8l3m.data.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Long? = null,
    val firstName: String,
    val lastName: String,
    val yearOfBirth: Int,
    val imageUrl: String
)
