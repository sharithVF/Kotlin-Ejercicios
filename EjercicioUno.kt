// Estructuras condicionales o de decisión
// Condiciones simples

// Haga un algoritmo que solicite el ingreso de un número positivo, en caso de ser negativo imprima un mensaje indicando
// que no es positivo

fun main() {
    println("Ingrese un número positivo: ")
    val num = readLine()!!.toInt()

    if(num < 0) {
        println("El número no es positivo")
    }
    println("El número es: $num")
}