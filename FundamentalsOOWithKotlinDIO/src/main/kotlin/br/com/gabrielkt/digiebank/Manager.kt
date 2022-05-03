package br.com.gabrielkt.digiebank

class Manager(
  name: String,
  cpf: String,
  salary: Double,
  val password: String
) : Employee(name = name, cpf = cpf, salary = salary), Logon {
    override fun calculateBonus(): Double = salary * 0.4
  override fun login(): Boolean = "senha123" == password
}