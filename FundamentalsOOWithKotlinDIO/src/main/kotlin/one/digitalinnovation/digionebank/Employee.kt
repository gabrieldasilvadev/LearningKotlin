package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Employee(
  override val name: String,
  override val cpf: String,
  val salary: BigDecimal
) : People(name, cpf) {}