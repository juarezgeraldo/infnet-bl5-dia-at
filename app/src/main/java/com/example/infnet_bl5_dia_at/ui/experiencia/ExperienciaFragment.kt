package com.example.infnet_bl5_dia_at.ui.experiencia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.infnet_bl5_dia_at.R
import com.example.infnet_bl5_dia_at.adapter.ExperienciaAdapter
import com.example.infnet_bl5_dia_at.dados.experiencias
import com.example.infnet_bl5_dia_at.modelo.ExperienciaViewModel

class ExperienciaFragment : Fragment() {
    private lateinit var experienciaViewModel: ExperienciaViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_experiencia, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            experienciaViewModel = ViewModelProvider(this).get(ExperienciaViewModel::class.java)
        }
        val recyclerview = view.findViewById<RecyclerView>(R.id.lista_experiencia)
        val adapter = ExperienciaAdapter(experiencias)
        recyclerview.adapter = adapter

    }
}