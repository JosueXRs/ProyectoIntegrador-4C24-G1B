package com.tecsup.proyectoapp.vistas.news

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.tecsup.proyectoapp.R
import kotlinx.android.synthetic.main.activity_noticias.*

class NewsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noticias)

        val actionBar = supportActionBar
        title = "Pagina Web del Hotel"

        WebViewNoticias.webViewClient = WebViewClient()
        WebViewNoticias.loadUrl("https://www.facebook.com/Hostal-King-Panther-105915945115694/")
        WebViewNoticias.settings.javaScriptEnabled = true
    }

}