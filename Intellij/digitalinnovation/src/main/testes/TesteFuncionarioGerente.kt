package main.testes

import main.Gerente

fun main(){
    val maria = Gerente("Maria Carla", "01651515", 5000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}