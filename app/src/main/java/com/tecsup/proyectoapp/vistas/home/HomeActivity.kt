package com.tecsup.proyectoapp.vistas.home

import android.content.Intent
import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.tecsup.proyectoapp.R
import com.tecsup.proyectoapp.vistas.main.MainFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val actionBar = supportActionBar
        actionBar?.hide()

        openFragment(MainFragment.newInstance())
        //configurationNavigationDrawer()
    }

    private fun openFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayoutContent,fragment)
        transaction.commit()

    }
}












