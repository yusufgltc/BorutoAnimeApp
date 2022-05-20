package com.example.android.borutoanimeapp.di

import android.content.Context
import com.example.android.borutoanimeapp.data.repository.DataStoreOperationsImpl
import com.example.android.borutoanimeapp.data.repository.Repository
import com.example.android.borutoanimeapp.domain.repository.DataStoreOperations
import com.example.android.borutoanimeapp.domain.use_cases.UseCases
import com.example.android.borutoanimeapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import com.example.android.borutoanimeapp.domain.use_cases.get_selected_hero.GetSelectedHeroUseCase
import com.example.android.borutoanimeapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.example.android.borutoanimeapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import com.example.android.borutoanimeapp.domain.use_cases.search_heroes.SearchHeroesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(@ApplicationContext context: Context): DataStoreOperations {
        return DataStoreOperationsImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository),
            searchHeroesUseCase = SearchHeroesUseCase(repository),
            getSelectedHeroUseCase = GetSelectedHeroUseCase(repository)
        )
    }
}
