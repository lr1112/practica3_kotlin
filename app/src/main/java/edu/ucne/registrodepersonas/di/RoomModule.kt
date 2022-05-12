package edu.ucne.registrodepersonas.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import edu.ucne.registrodepersonas.data.PersonasDb
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    private val PERSONAS_DATABASE_NAME = "PersonasDb"

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context)=
        Room.databaseBuilder(context, PersonasDb::class.java, PERSONAS_DATABASE_NAME).build()
    @Singleton
    @Provides
    fun providePersonasDao(db:PersonasDb)=db.getPersonasDao()


}