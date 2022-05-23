package edu.ucne.registrodepersonas.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel

import edu.ucne.registrodepersonas.data.PersonasDao
import edu.ucne.registrodepersonas.model.Personas
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PersonasViewModel @Inject constructor(
    val personasDao: PersonasDao): ViewModel() {

    private val _guardado = MutableLiveData(false)

    val guardado: LiveData<Boolean> get() = _guardado

    fun guardar(personas: Personas){
        viewModelScope.launch {
            personasDao.insertar(personas)
            _guardado.value=true
        }
    }
}

