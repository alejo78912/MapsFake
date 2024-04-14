package com.example.mapsfake

import Model.Place
import PlaceAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActivityAdmin : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PlaceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        // Configuración del RecyclerView
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = PlaceAdapter(getPlaces()) // Aquí deberías proporcionar la lista de usuarios
        recyclerView.adapter = adapter
    }

    // Esta función simulada devuelve una lista de usuarios
    private fun getPlaces(): List<Place> {
        return listOf(
            Place("Place 1", "Activo", "Alejo"),
            Place("Place 2", "Inactivo", "Alejo"),
            Place("Place 3", "Activo", "Alejo")

        )
    }
}
