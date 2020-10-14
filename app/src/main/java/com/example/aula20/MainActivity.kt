package com.example.aula20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun handleBtnLoginOnClick(v: View) {
        showSnackbar("onClick BtnLogin")
    }

    fun showSnackbar(msg: String) {
        val contextView = findViewById<View>(R.id.coordinator)

        val snackBar = Snackbar.make(contextView, msg, Snackbar.LENGTH_LONG)

        snackBar.setAction("Ok") {
            snackBar.dismiss()
        }.show()
    }
}