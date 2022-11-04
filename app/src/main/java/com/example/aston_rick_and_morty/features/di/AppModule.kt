package com.example.aston_rick_and_morty.features.di

import android.app.Application
import androidx.paging.ExperimentalPagingApi
import androidx.room.Room
import com.example.aston_rick_and_morty.data.api.ApiService
import com.example.aston_rick_and_morty.data.db.RickAndMortyDatabase
import com.example.aston_rick_and_morty.data.repository.CharactersRepository
import com.example.aston_rick_and_morty.data.repository.DefaultCharactersRepository
import dagger.Binds
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
    fun provideBaseUrl() = "https://rickandmortyapi.com/api/"


    @Provides
    @Singleton
    fun provideRetrofit(BASE_URL: String): ApiService =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideDatabase(app: Application) : RickAndMortyDatabase =
        Room.databaseBuilder(app, RickAndMortyDatabase::class.java, "rick_and_morty_database")
            .build()


    @ExperimentalPagingApi
    @Module
    @InstallIn(SingletonComponent::class)
    interface RepositoriesModule {

        @Binds
        fun bindCharactersRepository(
            charactersRepository: DefaultCharactersRepository
        ): CharactersRepository

    }


}