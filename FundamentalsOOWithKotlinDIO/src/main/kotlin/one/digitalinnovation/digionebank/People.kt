package one.digitalinnovation.digionebank

class People {
    var name: String = "Gabriel"
    var cpf: String = "123.456.789.11"

    inner class Adress {
        var street: String = "Rua teste"
    }
}

fun main() {
    val gabriel = People()

    println(gabriel.name)
    println(gabriel.cpf)

    println(gabriel.Adress().street)
}