package com.example.aston_rick_and_morty.models.local_dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LocalLocation(
    @PrimaryKey val id: Int,
    val name: String,
    val type: String,
    val url: String,
    val dimension: String
)
