package com.example.mapsfake

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    // Método para manejar el clic en el botón de inicio de sesión
    fun onLoginButtonClick(view: View) {
        // Crear un Intent para abrir LoginActivity
        val intent = Intent(this, LoginActivity::class.java)
        // Iniciar la actividad LoginActivity
        startActivity(intent)
    }
}
