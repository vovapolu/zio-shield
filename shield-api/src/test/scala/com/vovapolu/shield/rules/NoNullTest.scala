package com.vovapolu.shield.rules

import com.vovapolu.shield.ZioShieldDiagnostic.Lint
import utest._

object NoNullTest extends ZioShieldTest(ZioShieldNoNull) {
  val tests = Tests {
    test("example") {
      val List(lint1: Lint, lint2: Lint) = zioShieldInstance.run(srcPath)

      lint1.path ==> srcPath
      lint1.message ==> "null is forbidden"
      lint1.position.text ==> "null"

      lint2.path ==> srcPath
      lint2.message ==> "nullable method"
      lint2.position.text ==> "getParent"
    }
  }
}
