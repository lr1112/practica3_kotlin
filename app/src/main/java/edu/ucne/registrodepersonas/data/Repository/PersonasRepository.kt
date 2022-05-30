package edu.ucne.registrodepersonas.data.Repository

import edu.ucne.registrodepersonas.data.PersonasDao
import edu.ucne.registrodepersonas.model.Persona
import edu.ucne.registrodepersonas.model.Personas
import edu.ucne.registrodepersonas.model.toDomain
import javax.inject.Inject

class PersonasRepository @Inject constructor(
    private val personasDao: PersonasDao
) {
    suspend fun getAllQuotesFromDatabase(): List<Persona> {
        val response = personasDao.getLista()
        return response.map { it.toDomain() }
    }
    suspend fun insertPersonas(personas: Personas){
        personasDao.insertar(personas)

    }
    suspend fun clearPersonas(){
        personasDao.eliminar()
    }

}