package com.example.cemitrioconsolao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnEntrar.setOnClickListener {

            //Pegando as informações das edits
            val usuario = edtUsuario.text.toString().trim()
            val senha = edtSenha.text.toString().trim()
            // .trim -> elimina os espaços ao pegar o conteúdo

            if (usuario.isNotEmpty()) {
                if (senha.isNotEmpty()) {

                    if (usuario == "MateusCrespi" && senha == "123456789") {

                        // your code to perform when the user clicks on the TextView
                        Toast.makeText(this@LoginActivity, "Entrando", Toast.LENGTH_SHORT).show()
                        //Executando a intent
                        startActivity(Intent(this@LoginActivity, UsuarioActivity::class.java))

                    } else {
                        txvLogin.text = "senha ou usuario incorreto"
                        //Toast.makeText(this@LoginActivity, "senha ou usuario incorreto", Toast.LENGTH_SHORT).show()
                        //Testar
                    }

                } else {
                    txvSenha.text = "senha vazio"
                }

            } else {
                txvUsuario.text = "usuario vazio"
            }

            edtCadastrar.setOnClickListener {
                //Executando a intent
                startActivity(Intent(this@LoginActivity, CadastroActivity::class.java))

            }
        }
    }
}

