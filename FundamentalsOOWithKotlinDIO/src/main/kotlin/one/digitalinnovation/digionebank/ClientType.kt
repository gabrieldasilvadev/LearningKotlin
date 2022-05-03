package one.digitalinnovation.digionebank

enum class ClientType(val description: String) {
  PF("Pessoa Fisica"),
  PJ("Pessoa Juridica");

  companion object {
    fun printDescription() = ClientType
  }
}