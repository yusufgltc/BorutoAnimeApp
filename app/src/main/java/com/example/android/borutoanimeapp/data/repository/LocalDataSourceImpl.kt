package com.example.android.borutoanimeapp.data.repository

import com.example.android.borutoanimeapp.data.local.BorutoDatabase
import com.example.android.borutoanimeapp.domain.model.Hero
import com.example.android.borutoanimeapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(borutoDatabase: BorutoDatabase) : LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()
    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}