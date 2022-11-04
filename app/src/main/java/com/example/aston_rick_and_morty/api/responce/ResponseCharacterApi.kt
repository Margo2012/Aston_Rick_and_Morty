package com.example.aston_rick_and_morty.api.responce

import com.example.aston_rick_and_morty.api.models.Character

data class ResponseCharacterApi(
    val results: List<Character>
)
