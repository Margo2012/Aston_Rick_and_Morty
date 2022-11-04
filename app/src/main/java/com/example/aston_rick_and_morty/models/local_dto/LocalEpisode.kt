package com.example.aston_rick_and_morty.models.local_dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LocalEpisode(
    @PrimaryKey val id: Int,
    val name: String,
    val episode: String,
    val air_date: String,
    val url: String,
    val created: String
)
