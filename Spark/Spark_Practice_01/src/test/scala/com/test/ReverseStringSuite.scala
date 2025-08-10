package com.test

import StringReversal.ReverseString
import munit.FunSuite

class ReverseStringSuite extends FunSuite{
  val rs = new ReverseString()

  test("Check For Unequal Strings"){
    assertEquals(rs.reverseString("Hari"), "iraH")
  }

  test("Check for equal Strings"){
    assertEquals(rs.reverseString("ABBA"), "ABBA")
  }
}