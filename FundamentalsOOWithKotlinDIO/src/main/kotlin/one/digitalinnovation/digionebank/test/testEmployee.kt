package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Employee
import one.digitalinnovation.digionebank.People
import java.math.BigDecimal

fun main() {
  val gabriel = People(name = "gabriel", cpf = "111.222.333.44")
  println(gabriel.name)
  println(gabriel.cpf)

  val joao = Employee(name = "Joao", cpf = "222.333.444.55", salary = BigDecimal.valueOf(4500.0))
  println(joao.name)
  println(joao.cpf)
  println(joao.salary)
}