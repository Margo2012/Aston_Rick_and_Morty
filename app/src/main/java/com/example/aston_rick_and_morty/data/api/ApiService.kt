package com.example.aston_rick_and_morty.data.api

import com.example.aston_rick_and_morty.models.remote_dto.Character
import com.example.aston_rick_and_morty.data.api.responce.ResponseCharacterApi
import com.example.aston_rick_and_morty.data.api.responce.ResponseEpisodeApi
import com.example.aston_rick_and_morty.data.api.responce.ResponseLocationApi
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("character")
    suspend fun getAllCharacters(
        @Query("page") page: Int
    ):Response<ResponseCharacterApi>

    @GET("location")
    suspend fun getAllLocations(
        @Query("page") page: Int
    ): Response<ResponseLocationApi>

    @GET("episode")
    suspend fun getAllEpisodes(
        @Query("page") page: Int
    ):Response<ResponseEpisodeApi>

}