package br.com.gabrielkt.digiebank

class Manager(
  name: String,
  cpf: String,
  salary: Double
) : Employee(name = name, cpf = cpf, salary = salary) {
    override fun calculateBonus(): Double = salary * 0.4
}