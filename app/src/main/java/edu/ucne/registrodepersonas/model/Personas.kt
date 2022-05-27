package edu.ucne.registrodepersonas.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Personas")
data class Personas(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "personaid") val personaId: Int,
    @ColumnInfo(name = "nombre") val nombre: String,
    @ColumnInfo(name = "apellido") val apellido: String,
    @ColumnInfo(name = "correo") val correo: String,
    @ColumnInfo(name = "direccion") val direccion: String,
    @ColumnInfo(name = "telefono") val telefono: String,
    @ColumnInfo(name = "ocupacion") val ocupacion: String,
    @ColumnInfo(name = "salario") val salario: String
)

