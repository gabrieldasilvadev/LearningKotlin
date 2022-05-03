package br.com.gabrielkt.digiebank.test

import br.com.gabrielkt.digiebank.Bank

fun main() {
  val digiOneBank = Bank(name = "DigiBank", number = 12)

  println(digiOneBank.name)
  println(digiOneBank.number)

  val bank2 = digiOneBank.copy(name = "DigiBank2")

  println(bank2.info())
}