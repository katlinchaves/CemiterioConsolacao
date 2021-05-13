package com.example.cemitrioconsolao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Manipulando a execução
        Handler().postDelayed({
            //Criando uma intent explicita
            val intentLogin = Intent(this@MainActivity,LoginActivity::class.java)

            //Executando a intent
            startActivity(intentLogin)
        },500)
    }
}
