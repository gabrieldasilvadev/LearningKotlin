package one.digitalinnovation.digionebank

open class People {
    var name: String = "Gabriel"
    var cpf: String = "123.456.789.11"
    private set

    constructor()

    fun peopleInfo() = "$name e $cpf"
}

fun main() {
    val gabriel = People()

    println(gabriel.peopleInfo())
}
