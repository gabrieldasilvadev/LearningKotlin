package br.com.gabrielkt.digiebank.test

import br.com.gabrielkt.digiebank.Analyst

fun main() {
  val gabriel = Analyst(name = "gabriel", cpf = "111.222.333.44", salary = 2500.43)
  PrintReportEmployee.printReport(gabriel)
}
