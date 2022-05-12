package edu.ucne.registrodepersonas.model

import androidx.room.PrimaryKey

data class Personas(
    @PrimaryKey(autoGenerate = true)
    val PersonaId: Int,
    val Nombre: String,
    val Apellido: String,
    val Correo: String,
    val Direccion: String,
    val Telefono: String,
)

