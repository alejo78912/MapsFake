package com.example.mapsfake

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DialogResetPasswordEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_recovery_password_email)

        // Obtener referencia al botón "Recuperar Contraseña"
        val buttonRecoverPassword = findViewById<Button>(R.id.button_recover_password)

        // Configurar OnClickListener para el botón "Recuperar Contraseña"
        buttonRecoverPassword.setOnClickListener {
            // Crear un Intent para abrir la actividad DialogResetPasswordCode
            val intent = Intent(this, DialogResetPasswordCode::class.java)
            startActivity(intent)
        }
    }
}
