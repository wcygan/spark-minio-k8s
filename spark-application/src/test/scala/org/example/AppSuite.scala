package org.example

import org.specs2.mutable.Specification

class AppSpec extends Specification {
  "App" should {
    "assert true" in {
      true must beTrue
    }
  }
}