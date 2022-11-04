package com.example.aston_rick_and_morty.di

import com.example.aston_rick_and_morty.api.ApiService
import com.example.aston_rick_and_morty.repository.CharacterRepository
import com.example.aston_rick_and_morty.repository.ICharacterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRepo(): ICharacterRepository{
        return CharacterRepository()
    }

    /*@Provides
    fun provideBaseUrl() = "https://rickandmortyapi.com/api/"

    @Provides
    @Singleton
    fun provideRetrofit(BASE_URL: String): ApiService =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)*/

}