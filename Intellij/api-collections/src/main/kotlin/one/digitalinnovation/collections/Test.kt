package one.digitalinnovation.collections

fun main(){
    val pair = Pair("Joao", 1000.0)
    val map = mapOf(pair)

    val salario = map.get("Joao")
    val salario2 = map["Joao"]

    print("Salario: $salario  -  Salario2: $salario2")
}