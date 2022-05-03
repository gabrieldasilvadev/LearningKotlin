package br.com.gabrielkt.digiebank.test

import br.com.gabrielkt.digiebank.Client
import br.com.gabrielkt.digiebank.ClientType
fun main() {
  val rover = Client(
    name = "Marco Rover",
    cpf = "432.542.752-34",
    clientType = ClientType.PF,
    password = "cliente123"
  )

  println(rover)
  TestAuthentication().authenticate(rover)
}