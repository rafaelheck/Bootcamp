package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var clicks = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btCalcula = calcula
        val resultado = resultado

        btCalcula?.setOnClickListener{

            clicks++
            //Log.e("click", "Opa! cliquei no calcula $clicks")

            val nota1:Int = nota1.text.toString().toInt()
            val nota2:Int = nota2.text.toString().toInt()
            val faltas:Int = faltas.text.toString().toInt()
            val media:Int = (nota1 + nota2)/2

            if(media >= 6 && faltas <= 10){
                println("Aluno Aprovado")
                resultado.setText("Aluno Aprovado!!! \nMédia: $media \nFaltas: $faltas")
                resultado.setTextColor(Color.GREEN)
            }else{
                println("Aluno Reprovado")
                resultado.setText("Aluno Reprovado \nMédia: $media \nFaltas: $faltas")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}