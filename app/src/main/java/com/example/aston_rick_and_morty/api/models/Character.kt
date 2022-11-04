package com.example.aston_rick_and_morty.api.models



import android.os.Parcelable
import com.example.aston_rick_and_morty.data.Location
import kotlinx.parcelize.Parcelize

@Parcelize
data class Character(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: Location,
    val location: Location,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String
): Parcelable