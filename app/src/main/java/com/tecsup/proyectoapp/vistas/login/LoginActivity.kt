package com.tecsup.proyectoapp.vistas.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tecsup.proyectoapp.R
import com.tecsup.proyectoapp.vistas.users.UsuariosActivity
import com.tecsup.proyectoapp.vistas.home.HomeActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val actionBar = supportActionBar
        actionBar?.hide()

        btnIngresar.setOnClickListener {

            val correo = edtCorreo.text.toString()
            val clave = edtClave.text.toString()

            //startActivity(Intent(this, HomeActivity::class.java))

            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("email",correo)
            startActivity(intent)
            finish()
            //intent.putExtra("name","Victor Rodriguez")
            //intent.putExtra("job","Estudiante")
        }

        btnRegistrar2.setOnClickListener {
            startActivity(Intent(this, UsuariosActivity::class.java))
            finish()

        }
    }

    override fun onStart() {
        super.onStart()
        Log.v("CICLO_VIDA", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("CICLO_VIDA", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.v("CICLO_VIDA", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v("CICLO_VIDA", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("CICLO_VIDA", "onDestroy")
    }

}