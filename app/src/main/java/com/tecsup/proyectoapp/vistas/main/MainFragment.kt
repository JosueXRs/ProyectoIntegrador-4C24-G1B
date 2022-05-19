package com.tecsup.proyectoapp.vistas.main

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.PopupMenu
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.tecsup.proyectoapp.R
//import com.tecsup.proyectoapp.vistas.cursos.CursosRegistroActivity
import com.tecsup.proyectoapp.vistas.news.NewsActivity
import com.tecsup.proyectoapp.vistas.profile.PerfilActivity
//import com.tecsup.proyectoapp.vistas.students.REstudiantesActivity
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment: Fragment()/*, PopupMenu.OnMenuItemClickListener*/ {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnNoticias.setOnClickListener{
            startActivity(Intent(activity, NewsActivity::class.java))
        }

        btnCursos.setOnClickListener{
            //startActivity(Intent(activity, CursosRegistroActivity::class.java))
        }

        btnEstudiantes.setOnClickListener {
            //startActivity(Intent(activity, REstudiantesActivity::class.java))
        }

        /*
        floatingShare.setOnClickListener{
            val sendIntent = Intent().apply{
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,"Compartiendo un mensaje por intent")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent,"Tecsup")
            startActivity(shareIntent)
            /*val openUrl = Intent().apply{
                action = Intent.ACTION_VIEW
                data = Uri.parse("https://www.tecsup.edu.pe/")
            }
            startActivity(openUrl)*/
        }*/

        imgPerfil.setOnClickListener {
            startActivity(Intent(activity, PerfilActivity::class.java))
        }

        /*
        floatingContactos.setOnClickListener{
            showPopupMenu(it)
        }*/

        imgMenu.setOnClickListener {

        }

    }

    /*private fun showPopupMenu(view: View) {
        val popupMenu = PopupMenu(context, view)
        val inflater: MenuInflater = popupMenu.menuInflater
        inflater.inflate(R.menu.menu_emergente, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener(this)
        popupMenu.show()
    }*/

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }

    /*override fun onMenuItemClick(item: MenuItem?): Boolean {
        return when(item?.itemId) {
            R.id.item1 -> {
                Toast.makeText(context, "Opción 1", Toast.LENGTH_LONG).show()
                true
            }
            R.id.item2 -> {
                Toast.makeText(context, "Opción 2", Toast.LENGTH_LONG).show()
                true
            }
            R.id.item3 -> {
                Toast.makeText(context, "Opción 3", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.item4 -> {
                Toast.makeText(context, "Opción 4", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false
        }
    }*/
}