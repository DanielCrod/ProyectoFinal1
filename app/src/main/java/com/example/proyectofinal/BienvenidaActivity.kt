package com.example.proyectofinal

import Usuario.Usuario
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class BienvenidaActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var nombre : TextView
    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        nombre = findViewById(R.id.usuario)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener(this)

        if (intent.extras != null) {
            if (intent.hasExtra("Usuario")) {
                val n = intent.getSerializableExtra("Usuario") as Usuario
                nombre.setText(n.nombre)
            }
        }
    }

    override fun onClick(v: View?) {

        if (intent.extras != null) {
            if (intent.hasExtra("Usuario")) {
                val n = intent.getSerializableExtra("Usuario") as Usuario
                val intentInfo = Intent(this, InfoActivity::class.java)
                intentInfo.putExtra("Usuario", n)
                startActivity(intentInfo)
            }
        }
    }
}