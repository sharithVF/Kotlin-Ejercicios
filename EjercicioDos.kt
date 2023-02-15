// Condiciones dobles

//  Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3 notas parciales y con esto calcule el
// promedio de notas, valide que si el estudiante saca un promedio mayor o igual a 3.5 entonces indique que el estudiante ganó
// la materia, de lo contrario indique que la perdió, el mensaje deberá mencionar el nombre y la materia del estudiante.

fun main() {
    println("Ingrse su nombre: ")
    val nombre = readLine()!!

    println("Ingrse la materia: ")
    val materia = readLine()!!

    println("Ingrese la nota uno: ")
    val nota1 = readLine()!!.toFloat()

    println("Ingrese la nota dos: ")
    val nota2 = readLine()!!.toFloat()

    println("Ingrese la nota tres: ")
    val nota3 = readLine()!!.toFloat()

    val promedio = (nota1 + nota2 + nota3) / 3
    println("El promedio de notas es de: $promedio")

    if(promedio >= 3.5) {
        println("El estudiante $nombre ganó la materia $materia")
    } else {
        println("El estudiante $nombre perdió la materia $materia")
    }
}