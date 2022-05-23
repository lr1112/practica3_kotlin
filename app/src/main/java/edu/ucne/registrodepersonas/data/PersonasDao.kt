package edu.ucne.registrodepersonas.data


import androidx.room.*
import edu.ucne.registrodepersonas.model.Personas
import kotlinx.coroutines.flow.Flow


@Dao
interface PersonasDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    fun insertar (personas: Personas)

   /* @Query("SELECT * FROM Personas ORDER BY nombre DESC")
    fun getLista(): Flow<List<Personas>>*/

    @Delete
    suspend fun eliminar (personas: Personas)

    @Query("""
        
    SELECT * 
    FROM Personas 
    WHERE personaId =:personaId
    """)
    fun buscar(personaId: Int): Flow<Personas>


}