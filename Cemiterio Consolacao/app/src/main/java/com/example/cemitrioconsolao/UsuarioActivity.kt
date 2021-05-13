package com.example.cemitrioconsolao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_usuario.*

class UsuarioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        btnPerfil.setOnClickListener{
            //Executando a intent
            startActivity(Intent(this@UsuarioActivity, PerfilActivity::class.java))
        }

        btnPlano.setOnClickListener {
            startActivity(Intent(this@UsuarioActivity, PlanosActivity::class.java))
        }
    }
}
