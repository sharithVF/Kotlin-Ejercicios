// Estructuras iterativas o ciclos
// Do-while

// Haga un algoritmo que solicite el nombre de n cantidad de personas e imprima un saludo, el usuario ingresará la
// cantidad de personas a validar.

fun main() {
    println("Ingrese la cantidad de personas a saludas: ")
    val cantidadPersonas = readLine()!!.toInt()
    var contador = 1

    do {
        println("Ingrese el nombre de la persona $contador: ")
        val nombre = readLine()!!
        println("Hola $nombre, bienvenido")
        contador++
    } while (contador <= cantidadPersonas)
}