package com.example.cemitrioconsolao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_opcao.*
import android.widget.Toast

class OpcaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opcao)

        edtLogin.setOnClickListener {
            //Executando a intent
            startActivity(Intent(this@OpcaoActivity,LoginActivity::class.java))
        }

        edtCadastro.setOnClickListener {
            //Executando a intent
            startActivity(Intent(this@OpcaoActivity,CadastroActivity::class.java))
        }

    }
}
