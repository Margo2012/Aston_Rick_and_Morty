package com.example.aston_rick_and_morty.api.responce

import com.example.aston_rick_and_morty.api.models.Episode

data class ResponseEpisodeApi(
    val results: List<Episode>
)
