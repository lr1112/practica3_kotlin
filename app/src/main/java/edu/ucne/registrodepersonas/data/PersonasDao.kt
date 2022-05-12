package edu.ucne.registrodepersonas.data


import androidx.room.*
import edu.ucne.registrodepersonas.model.Personas


@Dao
interface PersonasDao {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun Insertar (personas: Personas)
    @Query("SELECT * FROM personas_table ORDER BY nombre DESC")
    suspend fun getList():List<Personas>
    @Delete
    suspend fun Eliminar (personas: Personas)
    @Query("SELECT * FROM PERSONAS_TABLE WHERE personaId= personaId")
    suspend fun Buscar(personas: Personas)


}