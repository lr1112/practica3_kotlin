package edu.ucne.registrodepersonas.data


import androidx.room.*
import edu.ucne.registrodepersonas.model.Personas
import kotlinx.coroutines.flow.Flow


@Dao
interface PersonasDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    fun insertar (personas: Personas)

   @Query("""
       SELECT * 
       FROM Personas 
       """)
    fun getLista(): List<Personas>

    @Query("DELETE FROM Personas")
    suspend fun eliminar ()

    @Query("""
        
    SELECT * 
    FROM Personas 
    WHERE personaId =:personaId
    """)
    fun buscar(personaId: Int): List<Personas>


}