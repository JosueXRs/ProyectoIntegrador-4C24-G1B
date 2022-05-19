package com.tecsup.proyectoapp.vistas.users
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.tecsup.proyectoapp.R
import com.tecsup.proyectoapp.vistas.home.HomeActivity
//import com.tecsup.proyectoapp.vistas.cursos.RCursosActivity
import kotlinx.android.synthetic.main.activity_usuarios.*

class UsuariosActivity: AppCompatActivity (), AdapterView.OnItemSelectedListener {
    val listaOpciones = arrayOf("Comun", "VIP")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuarios)
        val actionBar = supportActionBar
        actionBar?.setDisplayShowHomeEnabled(true)
        title = "Registro de Usuarios"

        spinneropciones.onItemSelectedListener = this

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaOpciones)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinneropciones.adapter = adapter
        btnRegistrar.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
    }
}