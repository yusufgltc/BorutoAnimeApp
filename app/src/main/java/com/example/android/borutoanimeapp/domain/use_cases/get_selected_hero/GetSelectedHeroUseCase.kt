package com.example.android.borutoanimeapp.domain.use_cases.get_selected_hero

import com.example.android.borutoanimeapp.data.repository.Repository
import com.example.android.borutoanimeapp.domain.model.Hero

class GetSelectedHeroUseCase(
   private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero {
        return repository.getSelectedHero(heroId = heroId)
    }
}