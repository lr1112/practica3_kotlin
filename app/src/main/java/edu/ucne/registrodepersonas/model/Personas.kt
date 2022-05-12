package edu.ucne.registrodepersonas.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "personas_table")
data class Personas(
    @PrimaryKey(autoGenerate = true)
    val personaId: Int,
    val nombre: String,
    val apellido: String,
    val correo: String,
    val direccion: String,
    val telefono: String,
    val ocupacion: String,
    val salario: Float
)

