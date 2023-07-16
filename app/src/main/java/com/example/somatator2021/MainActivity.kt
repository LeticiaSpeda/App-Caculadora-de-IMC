package com.example.somatator2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val edtPeso = findViewById<EditText>(R.id.edtPeso)
        val edtAltura = findViewById<EditText>(R.id.edtAltura)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)


        btnCalcular.setOnClickListener {
            val peso = edtPeso.text.toString().toDouble();
            val altura = edtAltura.text.toString().toDouble();

            val resultado = peso / altura * altura

            tvResultado.text = "Seu IMC é ${resultado}"

        }


    }
}