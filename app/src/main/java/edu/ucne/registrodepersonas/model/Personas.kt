package edu.ucne.registrodepersonas.model

import androidx.room.PrimaryKey

data class Personas(
    @PrimaryKey(autoGenerate = true)
    val personaId: Int,
    val nombre: String,
    val apellido: String,
    val correo: String,
    val direccion: String,
    val telefono: String,
)

