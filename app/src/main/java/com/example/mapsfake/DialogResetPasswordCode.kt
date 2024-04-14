package com.example.mapsfake

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class DialogResetPasswordCode : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_recovery_password_code)

        val button_recover_password = findViewById<Button>(R.id.button_recover_password)

        button_recover_password.setOnClickListener {
            val intent = Intent(this, DialogResetPassword::class.java)
            startActivity(intent)
        }

    }
}
