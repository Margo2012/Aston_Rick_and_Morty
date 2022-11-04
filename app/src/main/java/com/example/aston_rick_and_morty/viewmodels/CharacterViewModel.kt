package com.example.aston_rick_and_morty.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.aston_rick_and_morty.api.ApiService
import com.example.aston_rick_and_morty.paging.CharacterPagingSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel()
class CharacterViewModel
@Inject constructor(apiService: ApiService):ViewModel(){

    val listData = Pager(
        config = PagingConfig(pageSize = 1),
    ){
       CharacterPagingSource(apiService)
    }.flow.cachedIn(viewModelScope)

}