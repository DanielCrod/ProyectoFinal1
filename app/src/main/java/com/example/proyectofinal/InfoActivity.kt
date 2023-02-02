package com.example.proyectofinal

import SQL.SqliteHelper
import Usuario.UsuariosContract
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class InfoActivity : AppCompatActivity() {

    private lateinit var list : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        list = findViewById(R.id.list)

        val arrayUsuarios = ArrayList<String>()
        val helper = SqliteHelper(this)
        val cursor = helper.mostrar()

        while (cursor.moveToNext()) {
            arrayUsuarios.add(
                cursor.getString(cursor.getColumnIndexOrThrow(UsuariosContract.NOMBRE))
            )
        }

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayUsuarios)
        list.adapter = adaptador
    }
}