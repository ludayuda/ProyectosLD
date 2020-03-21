package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative_vs_line.*

class RelativeVsLineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_vs_line)

        val user=intent.extras!!.getString("user")
        val vbleContrasena=intent.getStringExtra("Contrasena")
        edName.setText(user)
        Contrasena.setText(vbleContrasena)

    }
}
