// while

// Haga un algoritmo que solicite un número y si este es negativo lo convierta a positivo y lo imprima, realice este proceso
// n cantidad de veces.

fun main() {

    var numero: Int
    var continuar = "si"

    while(continuar.uppercase() == "SI") {
        println("Ingrese un número: ")
        numero = readLine()!!.toInt()

        if(numero < 0) {
            numero = numero * -1
        }

        println("El número positivo es: $numero")
        print("¿Desea continuar? si/no")
        continuar = readLine()!!
    }
}