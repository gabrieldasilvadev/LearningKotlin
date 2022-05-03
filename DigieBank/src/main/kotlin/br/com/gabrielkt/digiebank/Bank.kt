package br.com.gabrielkt.digiebank

data class Bank(
  val name: String,
  val number: Int
) {
  fun info() = "$name - $number"
}
