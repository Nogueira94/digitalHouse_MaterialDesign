package com.example.aula20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula20.domain.Usuario
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.card_corpo_login.*
import kotlinx.android.synthetic.main.card_corpo_login.view.*
import kotlin.random.Random

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            startActivityMain()
        }

        btnCadastrar.setOnClickListener {
            startActivityCadastro()
        }
    }

    fun startActivityMain() {
        val usuario = dadosForm()

        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key", usuario)
        startActivity(intent)
    }

    fun startActivityCadastro() {
        val intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }

    fun dadosForm(): Usuario {
        val idUsuario = Random.nextInt()
        val txtUsuario = inpUsuario.text.toString()
        val txtSenha = inpSenha.text.toString()

        return Usuario(idUsuario, txtUsuario, txtSenha)
    }
}