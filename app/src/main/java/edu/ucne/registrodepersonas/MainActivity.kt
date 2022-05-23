package edu.ucne.registrodepersonas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import edu.ucne.registrodepersonas.databinding.ActivityMainBinding
import edu.ucne.registrodepersonas.model.Personas
import edu.ucne.registrodepersonas.viewmodel.PersonasViewModel


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private val personasViewModel: PersonasViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.guardar.setOnClickListener {
            personasViewModel.guardar(Personas(0,
                binding.nombre.text.toString(),
                binding.telefono.text.toString(),
                binding.direccion.text.toString(),
                binding.correo.text.toString(),
                binding.apellido.text.toString(),
                binding.ocupacion.text.toString(),
                binding.salario.text.toString()

            ))
        }
        personasViewModel.guardado.observe(this){
            if(it){
                Snackbar.make(binding.nombre, "Guardado",Snackbar.LENGTH_LONG).show()
            }
        }
    }


}