package com.example.android.borutoanimeapp.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.android.borutoanimeapp.data.local.BorutoDatabase
import com.example.android.borutoanimeapp.data.paging_source.HeroRemoteMediator
import com.example.android.borutoanimeapp.data.remote.BorutoApi
import com.example.android.borutoanimeapp.domain.model.Hero
import com.example.android.borutoanimeapp.domain.repository.RemoteDataSource
import com.example.android.borutoanimeapp.util.Constant.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow

@ExperimentalPagingApi
class RemoteDataSourceImpl(
    private val burutoApi: BorutoApi,
    private val borutoDatabase: BorutoDatabase
) : RemoteDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override fun getAllHeroes(): Flow<PagingData<Hero>> {
        val pagingSourceFactory = { heroDao.getAllHeroes() }
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = HeroRemoteMediator(
                borutoApi = burutoApi,
                borutoDatabase = borutoDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

    override fun searchHeroes(): Flow<PagingData<Hero>> {
        TODO("Not yet implemented")
    }

}