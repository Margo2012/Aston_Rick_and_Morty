package com.example.aston_rick_and_morty.data.db.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.aston_rick_and_morty.models.local_dto.LocalEpisode

@Dao
interface EpisodeDao {
    @Query("SELECT * FROM LocalEpisode")
    fun getAllEpisodes(): PagingSource<Int, LocalEpisode>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEpisodes(episodes: List<LocalEpisode>)

    @Query("DELETE FROM LocalEpisode")
    suspend fun deleteAllEpisodes()
}