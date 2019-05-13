import org.scalatest.FunSuite

class FunctionsSpec extends FunSuite {

  test("pure function example") {

    def square(x: Int) = x * x
    val result = square(4)

    assert(result == 16)
  }

}
