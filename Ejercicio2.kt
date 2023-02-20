//Listas 

fun main() {
    //Lista inmutable
    val names = listOf("Sandra", "Luis", "Rosa", "Carla", "Julio")

    println(names)

    //Lista mutable
    val newNames = mutableListOf("Sandra", "Luis", "Carla", "Julio")

    newNames.add("Camila")
    newNames.add(3, "Juan")
    println(newNames)

    newNames.remove("Camila")
    newNames.removeAt(3)
    println(newNames)
}
