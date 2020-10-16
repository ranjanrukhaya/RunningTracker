package com.gaura.learn.runtracker.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.gaura.learn.runtracker.db.RunDAO
import com.gaura.learn.runtracker.db.RunningDatabase
import com.gaura.learn.runtracker.other.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDatabase(@ApplicationContext app: Context) = Room.databaseBuilder(
        app,
        RoomDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideRunDao(db: RunningDatabase) = db.getRunDao()
}