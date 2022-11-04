package com.example.aston_rick_and_morty.api.models

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize

@Entity(tableName = "episodes")
@Parcelize
data class Episode(
    val id: Int,
    val name: String,
    val episode: String,
    val air_date: String,
    val url: String,
    val created: String
    ): Parcelable
