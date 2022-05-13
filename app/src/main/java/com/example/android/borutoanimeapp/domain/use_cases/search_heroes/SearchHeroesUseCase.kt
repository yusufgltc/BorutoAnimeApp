package com.example.android.borutoanimeapp.domain.use_cases.search_heroes

import androidx.paging.PagingData
import com.example.android.borutoanimeapp.data.repository.Repository
import com.example.android.borutoanimeapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class SearchHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(query: String): Flow<PagingData<Hero>> {
        return repository.searchHeroes(query = query)
    }
}