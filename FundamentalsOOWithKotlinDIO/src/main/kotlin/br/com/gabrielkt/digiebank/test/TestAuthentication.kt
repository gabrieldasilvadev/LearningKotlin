package br.com.gabrielkt.digiebank.test

import br.com.gabrielkt.digiebank.Logon

class TestAuthentication {
  fun authenticate(logon: Logon) = println("Logon: ${logon.login()}")
}