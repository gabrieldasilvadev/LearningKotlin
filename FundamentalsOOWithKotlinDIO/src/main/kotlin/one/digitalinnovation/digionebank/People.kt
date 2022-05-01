package one.digitalinnovation.digionebank

class People {
    var name: String = "Gabriel"
    var cpf: String = "123.456.789.11"
    private set
}

fun main() {
    val gabriel = People()

    println(gabriel.name)
    println(gabriel.cpf)
}