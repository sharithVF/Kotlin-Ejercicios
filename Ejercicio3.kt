//Conjuntos

fun main() {
    //Conjuntos inmutables
    val positiveNumbers = setOf(1, 2, 3, 4)

    println(positiveNumbers)

    //Conjuntos mutables

    val aNumbers = mutableSetOf(1, 2, 4, 10, 16)
    val bNumbers = mutableSetOf<Int>()

    println("Numbers A = $aNumbers y Numbers B = $bNumbers")

    aNumbers.add(19)
    bNumbers.add(19)
    bNumbers.add(33)
    bNumbers.add(444)

    println("Numbers A = $aNumbers y Numbers B = $bNumbers")

    aNumbers.clear()
    bNumbers.clear()
    println("Numbers A = $aNumbers y Numbers B = $bNumbers")
}