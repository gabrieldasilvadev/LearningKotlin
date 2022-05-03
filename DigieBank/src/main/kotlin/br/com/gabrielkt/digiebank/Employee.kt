package br.com.gabrielkt.digiebank

abstract class Employee(
  name: String,
  cpf: String,
  val salary: Double
) : People(name, cpf) {
  protected abstract fun calculateBonus(): Double

  override fun toString():String = """
     Nome: $name
     CPF: $cpf
     Salary: $salary
     Bonus: ${calculateBonus()}
    """.trimIndent()
}