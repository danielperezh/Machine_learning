package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.R
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.test.DetectorActivity

class inicio : AppCompatActivity() {
    var iniciar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_inicio)
        iniciar = findViewById<View>(R.id.btn_iniciar) as Button
        iniciar!!.setOnClickListener { iniciar() }
    }

    private fun iniciar() {
        val intent = Intent(this@inicio, DetectorActivity::class.java)
        startActivity(intent)
    }
}