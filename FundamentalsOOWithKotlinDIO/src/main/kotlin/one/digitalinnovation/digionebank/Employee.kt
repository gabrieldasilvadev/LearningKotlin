package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Employee(
  name: String,
  cpf: String,
  val salary: BigDecimal
) : People(name, cpf) {
  abstract fun calculateBonus():
}