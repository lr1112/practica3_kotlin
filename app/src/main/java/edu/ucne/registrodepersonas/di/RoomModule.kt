package edu.ucne.registrodepersonas.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import edu.ucne.registrodepersonas.data.PersonasDao
import edu.ucne.registrodepersonas.data.PersonasDb
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context): PersonasDb {
        val DATABASE_NAME = "PersonasDb"
        return Room.databaseBuilder(
            context,
            PersonasDb::class.java,
            DATABASE_NAME       )
            .fallbackToDestructiveMigration()
            .build()
    }
    @Singleton
    @Provides
    fun providePersonasDao(personasDb: PersonasDb): PersonasDao{
        return personasDb.personasDao
    }


}