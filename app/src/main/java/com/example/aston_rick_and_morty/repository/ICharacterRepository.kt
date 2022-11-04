package com.example.aston_rick_and_morty.repository

import com.example.aston_rick_and_morty.api.models.Character

interface ICharacterRepository {
    fun getCharacters(): List<Character>
}