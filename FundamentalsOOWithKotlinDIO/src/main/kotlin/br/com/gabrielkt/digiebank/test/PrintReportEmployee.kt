package br.com.gabrielkt.digiebank.test

import br.com.gabrielkt.digiebank.Employee

class PrintReportEmployee {
  companion object {
    fun printReport(employee: Employee) {
      println(employee.toString())
    }
  }
}