package com.example.aston_rick_and_morty.data.repository

import androidx.paging.PagingData
import com.example.aston_rick_and_morty.models.local_dto.LocalCharacter
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {

    fun getCharacters(): Flow<PagingData<LocalCharacter>>

}