package com.example.aston_rick_and_morty.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.aston_rick_and_morty.data.db.dao.CharacterDao
import com.example.aston_rick_and_morty.data.db.dao.EpisodeDao
import com.example.aston_rick_and_morty.data.db.dao.LocationDao
import com.example.aston_rick_and_morty.models.local_dto.LocalCharacter
import com.example.aston_rick_and_morty.models.local_dto.LocalEpisode
import com.example.aston_rick_and_morty.models.local_dto.LocalLocation


@Database(entities = [LocalCharacter::class, LocalLocation::class, LocalEpisode::class], version = 1)
abstract class RickAndMortyDatabase: RoomDatabase() {

    abstract fun characterDao(): CharacterDao
    abstract fun episodeDao(): EpisodeDao
    abstract fun locationDao(): LocationDao

}