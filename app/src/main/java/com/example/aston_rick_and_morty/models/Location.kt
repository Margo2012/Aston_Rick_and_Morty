package com.example.aston_rick_and_morty.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location(
    val id: Int,
    val name: String,
    val type: String,
    val url: String,
    val dimension: String,
    val created: String
): Parcelable