package main.testes

import main.Cliente
import main.ClienteTipo

fun main(){
    val douglas = Cliente("Douglas Junior", "941561951", ClienteTipo.PF, "12345")

    println(douglas.toString())
    TesteAutenticacao().autentica(douglas)

}