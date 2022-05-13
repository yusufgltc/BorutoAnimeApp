package com.example.android.borutoanimeapp.domain.repository

import androidx.paging.PagingData
import com.example.android.borutoanimeapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    fun getAllHeroes(): Flow<PagingData<Hero>>
    fun searchHeroes(query: String): Flow<PagingData<Hero>>
}