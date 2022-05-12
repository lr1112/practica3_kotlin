package edu.ucne.registrodepersonas.data

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.registrodepersonas.model.Personas

@Database(entities = [Personas::class],
    version = 1
)
abstract class PersonasDb: RoomDatabase() {
        abstract val personasDao: PersonasDao
}