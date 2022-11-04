package com.example.aston_rick_and_morty.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.aston_rick_and_morty.data.db.dao.CharacterDao
import com.example.aston_rick_and_morty.models.local_dto.LocalCharacter
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton


@ExperimentalPagingApi
@Singleton
class DefaultCharactersRepository @Inject constructor(
    private val characterDao: CharacterDao,
    private val remoteMediatorFactory: CharacterRemoteMediator.Factory
) : CharactersRepository {

    override fun getCharacters(): Flow<PagingData<LocalCharacter>> {
        return Pager(
                config = PagingConfig(
                    pageSize = PAGE_SIZE,
                    initialLoadSize = PAGE_SIZE // not required, may be deleted
                ),
                remoteMediator = remoteMediatorFactory.create(),
                pagingSourceFactory = { characterDao.getAllCharacters() }
            ).flow
    }

    private companion object {
        const val PAGE_SIZE = 30
    }
}