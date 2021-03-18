package one.digitalinnovation.collections

fun main(){
    val nomes = Array(3) {""}
    nomes.set(0, "Maria")
    nomes.set(1, "Zazá")
    nomes.set(2, "José")

    for(nome in nomes){
        println(nome)
    }

    println("------------------")
    nomes.sort()
    nomes.forEach{
        println(it)
    }

    println("------------------")
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.forEach{
        println(it)
    }
}

