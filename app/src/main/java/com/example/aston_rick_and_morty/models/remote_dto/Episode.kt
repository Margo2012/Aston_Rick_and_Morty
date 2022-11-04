package com.example.aston_rick_and_morty.models.remote_dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Episode(
    val id: Int,
    val name: String,
    val episode: String,
    val air_date: String,
    val url: String,
    val created: String
    ): Parcelable
