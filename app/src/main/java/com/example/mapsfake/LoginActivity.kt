package com.example.mapsfake

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_login)

        // Obtener referencia al TextView "¿No tienes una cuenta? Regístrate"
        val textRegister = findViewById<TextView>(R.id.text_register)

        // Configurar OnClickListener para el TextView "¿No tienes una cuenta? Regístrate"
        textRegister.setOnClickListener {
            // Crear un Intent para abrir la actividad DialogRegisterActivity
            val intent = Intent(this, DialogRegisterActivity::class.java)
            startActivity(intent)
        }

        // Obtener referencia al TextView "¿Olvidaste tu contraseña?"
        val textForgotPassword = findViewById<TextView>(R.id.text_forgot_password)

        // Configurar OnClickListener para el TextView "¿Olvidaste tu contraseña?"
        textForgotPassword.setOnClickListener {
            // Crear un Intent para abrir la actividad DialogResetPasswordEmail
            val intent = Intent(this, DialogResetPasswordEmail::class.java)
            startActivity(intent)
        }
    }
}
