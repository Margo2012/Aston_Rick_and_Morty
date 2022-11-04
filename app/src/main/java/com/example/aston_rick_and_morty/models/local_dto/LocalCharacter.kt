package com.example.aston_rick_and_morty.models.local_dto

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.aston_rick_and_morty.models.remote_dto.Character

@Entity
data class LocalCharacter(val character: Character ?= null,
                          @PrimaryKey val id: Int ? = character?.id,
                          val name: String ?= character?.name,
                          val status: String ?= character?.status,
                          val species: String ?= character?.species,
                          val type: String ?= character?.type,
                          val gender: String ?= character?.gender,
                          val image: String ?= character?.image,
                          val url: String ?= character?.url,
                          val created: String ?= character?.created
)
