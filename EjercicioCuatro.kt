// Condicionales multiples (anidadas)

fun main() {
    val num1 = 2.0
    val num2 = 1.0
    val num3 = 1.0

    val promedio = (num1 + num2 + num3) / 3

    val resultado = if (promedio >= 3.5) "Ganó" else if (promedio > 2) "recuperá" else "perdió"
    println("El promedio es $promedio y la persona $resultado")
}