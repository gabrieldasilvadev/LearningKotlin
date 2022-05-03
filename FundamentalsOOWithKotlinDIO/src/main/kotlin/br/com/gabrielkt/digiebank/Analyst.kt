package br.com.gabrielkt.digiebank

class Analyst(
  name: String,
  cpf: String,
  salary: Double
) : Employee(name, cpf, salary) {
  override fun calculateBonus() = salary * 0.1
}