package br.com.gabrielkt.digiebank.test

import br.com.gabrielkt.digiebank.Analytic

fun main() {
  val gabriel = Analytic(name = "gabriel", cpf = "111.222.333.44", salary = 2500.43)
  PrintReportEmployee.printReport(gabriel)
}
