package br.com.gabrielkt.digiebank.test

import br.com.gabrielkt.digiebank.Manager

fun main() {
  val brandao = Manager(name = "Brandao", cpf = "435.217.326.12", salary = 15830.32)
  PrintReportEmployee.printReport(brandao)
}