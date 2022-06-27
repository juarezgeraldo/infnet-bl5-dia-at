package com.example.infnet_bl5_dia_at.modelo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExperienciaViewModel: ViewModel() {
    val experiencias = MutableLiveData<List<Experiencia>>()
}