package edu.ucne.registrodepersonas.model

data class Persona (val personaId: Int,
                    val nombre: String,
                    val apellido: String,
                    val correo: String,
                    val direccion: String,
                    val telefono: String,
                    val ocupacion: String,
                    val salario: String
)
fun Personas.toDomain()= Persona(personaId,nombre,apellido,correo,direccion,telefono,ocupacion,salario)