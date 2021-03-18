package main.testes

import main.Banco

fun main(){
    val digOneBank = Banco("DigiOne", 12)

    println(digOneBank.info())

    val banco2 = digOneBank.copy("Banco2")

    println(banco2.info())

}