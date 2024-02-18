package com.group.libraryapp.calculator

fun main() {
    val calculator = CalculatorTest()
    calculator.addTest()
    calculator.minusTest()
    calculator.multiplyTest()
    calculator.divideTest()
    calculator.divideExceptionTest()
}

class CalculatorTest {

    fun addTest() {

        // given
        var calculator = Calculator(5)

        // when
        calculator.add(3)

        // then
        if (calculator.number != 8) {
            throw IllegalArgumentException()
        }
    }

    fun minusTest() {

        // given
        var calculator = Calculator(5)

        // when
        calculator.minus(2)

        // then
        if (calculator.number != 3) {
            throw IllegalArgumentException()
        }
    }

    fun multiplyTest() {

        // given
        var calculator = Calculator(5)

        // when
        calculator.multiply(3)

        // then
        if (calculator.number != 15) {
            throw IllegalArgumentException()
        }
    }

    fun divideTest() {

        // given
        var calculator = Calculator(5)

        // when
        calculator.divide(2)

        // then
        if (calculator.number != 2) {
            throw IllegalArgumentException()
        }
    }

    fun divideExceptionTest() {

        // given
        var calculator = Calculator(5)

        // when
        try {
            calculator.divide(0)
        } catch (e: IllegalArgumentException) {
            if (e.message != "0으로 나눌 수 없습니다") {
                throw IllegalArgumentException("메시지가 다릅니다")
            }
            return
        } catch (e: Exception) {
            throw IllegalArgumentException()
        }

        throw IllegalArgumentException("원하는 결과값이 나오지 않았습니다")

    }
}