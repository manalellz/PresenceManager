package com.example.presencemanager

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.text.util.Linkify
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCommencer = findViewById<Button>(R.id.btnCommencer)
        btnCommencer.setOnClickListener {
            val intention = Intent(this, DashboardActivity::class.java)
            startActivity(intention)
        }

        findViewById<TextView>(R.id.txtFooter).setOnClickListener {
            afficherInfosDeveloppeur()
        }
    }

    private fun afficherInfosDeveloppeur() {
        val dialogue = AlertDialog.Builder(this)
            .setTitle("Informations du développeur")
            .setMessage(
                "Application : PrésenceManager\n" +
                        "Version : 1.0\n" +
                        "Développeur : Mohamed EL HAIRCHE\n" +
                        "GitHub : https://github.com/Mohamed22-Dev/PresenceManager"
            )
            .setPositiveButton("OK", null)
            .show()

        dialogue.findViewById<TextView>(android.R.id.message)?.let { texte ->
            Linkify.addLinks(texte, Linkify.WEB_URLS)
            texte.movementMethod = LinkMovementMethod.getInstance()
        }
    }
}
