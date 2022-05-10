package com.example.android.borutoanimeapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.android.borutoanimeapp.data.local.BorutoDatabase
import com.example.android.borutoanimeapp.util.Constant.BORUTO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): BorutoDatabase {
        return Room.databaseBuilder(
            context,
            BorutoDatabase::class.java,
            BORUTO_DATABASE
        ).build()
    }
}