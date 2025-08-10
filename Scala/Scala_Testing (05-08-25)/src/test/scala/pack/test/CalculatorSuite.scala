package pack.test

import com.testing.Calculator
import munit.FunSuite

class CalculatorSuite extends FunSuite {
  val cal = new Calculator

  test("Addition of 2 and 3 should return 5") {
    assertEquals(cal.add(2, 3), 5)
  }

  test("Subtraction of 5 and 3 should return 2") {
    assertEquals(cal.sub(5, 3), 2)
  }

  test("Multiplication of 2 and 3 should return 6") {
    assertEquals(cal.mul(2, 3), 6)
  }

  test("Division of 6 and 3 should return 2") {
    assertEquals(cal.div(6, 3), 2)
  }
}


