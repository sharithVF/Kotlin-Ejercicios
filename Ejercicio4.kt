//Mapas

fun main() {

    //Mapas inmutables
    var userInfo: Map<String, String> = mapOf(
        "name" to "Juan",
        "lastName" to "Cardona",
        "age" to "Ten",
        "profession" to "Student"
    )
    println("$userInfo")

    //Mapas mutables
    var userInformacion = mutableMapOf(
        "name" to "Juan",
        "lastName" to "Cardona",
        "age" to "Ten",
    )
    println("$userInformacion")

    userInformacion["age"] = "Twenty"
    userInformacion.put("profession", "Developer")
    println("$userInformacion")

    userInformacion.remove("profession")
    println("$userInformacion")
}