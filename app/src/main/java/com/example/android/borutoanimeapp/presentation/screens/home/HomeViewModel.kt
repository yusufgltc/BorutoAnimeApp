package com.example.android.borutoanimeapp.presentation.screens.home

import androidx.lifecycle.ViewModel
import com.example.android.borutoanimeapp.domain.use_cases.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    useCases: UseCases
) : ViewModel() {
    val getAllHeroes = useCases.getAllHeroesUseCase()
}