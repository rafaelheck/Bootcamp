package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 9
    values[2] = 3
    values[3] = 16
    values[4] = 7

   for (value in values) {
        println(value)
    }

    println("----------------------")
    values.forEach {
        println(it)
    }

    println("----------------------")
    for (index in values.indices){
        println(values[index])
    }

    println("----------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}