package com.example.mapsfake

import android.content.Intent
import android.os.Bundle
import android.view.View // Importación de View agregada
import androidx.appcompat.app.AppCompatActivity
class DialogRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_register) // Establecer el contenido del diseño XML
    }
    // Método para manejar el clic en el texto "¿Ya tienes una cuenta? Inicia Sesión Ahora"
    fun onAlreadyHaveAccountClick(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish() // Opcional: finaliza la actividad actual para que no quede en el historial
    }
}
