package br.com.gabrielkt.digiebank

class Client(
  name: String,
  cpf: String,
  val clientType: ClientType,
  val password: String
) : People(name, cpf), Logon {
  override fun login(): Boolean = "cliente123" == password

  override fun toString(): String = """
    Name: $name
    cpf: $cpf
    type: ${clientType.description}
  """.trimIndent()
}