package com.example.aston_rick_and_morty.data.db.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.aston_rick_and_morty.models.local_dto.LocalLocation
import kotlinx.coroutines.flow.Flow

@Dao
interface LocationDao {
    @Query("SELECT * FROM LocalLocation")
    fun getAllLocations(): PagingSource<Int, LocalLocation>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLocations(locations: List<LocalLocation>)

    @Query("DELETE FROM LocalLocation")
    suspend fun deleteAllLocations()
}