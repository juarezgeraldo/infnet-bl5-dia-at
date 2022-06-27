package com.example.infnet_bl5_dia_at.modelo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CursoViewModel: ViewModel() {
    val cursos = MutableLiveData<List<Curso>>()
}