package com.example.aston_rick_and_morty.data.db.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.aston_rick_and_morty.models.local_dto.LocalCharacter

@Dao
interface CharacterDao {
    @Query("SELECT * FROM LocalCharacter")
    fun getAllCharacters(): PagingSource<Int, LocalCharacter>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacters(characters: List<LocalCharacter>)

    @Query("DELETE FROM LocalCharacter")
    suspend fun deleteAllCharacters()
}