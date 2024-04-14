package com.example.mapsfake

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DialogResetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_recovery_password)

        // Obtener referencia al botón "Restablecer Contraseña"
        val buttonResetPassword = findViewById<Button>(R.id.button_reset_password)

        // Configurar OnClickListener para el botón "Restablecer Contraseña"
        buttonResetPassword.setOnClickListener {
            // Crear un Intent para abrir la actividad LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            // Finalizar esta actividad para que no quede en la pila de actividades
            finish()
        }
    }
}
