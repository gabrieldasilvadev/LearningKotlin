package br.com.gabrielkt.digiebank.test

import br.com.gabrielkt.digiebank.ClientType

fun main() {
  ClientType.values().forEach { element ->
    println("${element.name} - ${element.description}")
  }

  ClientType.values().forEach {
    println("${it.name} - ${it.description}")
  }

  val pf = ClientType.PF
  println("${pf.name} = ${pf.description}")
  val pj = ClientType.PF
  println("${pj.name} = ${pj.description}")
}