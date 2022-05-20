package com.example.android.borutoanimeapp.domain.repository

import com.example.android.borutoanimeapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}