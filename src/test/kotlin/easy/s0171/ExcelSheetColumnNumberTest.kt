package easy.s0171

import easy.s0171.ExcelSheetColumnNumber.Companion.titleToNumber
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExcelSheetColumnNumberTest {

    @Test
    fun test1() {
        val columnTitle = "A"
        val expectedResult = 1
        assertEquals(expectedResult, titleToNumber(columnTitle))
    }

    @Test
    fun test2() {
        val columnTitle = "ZY"
        val expectedResult = 701
        assertEquals(expectedResult, titleToNumber(columnTitle))
    }

    @Test
    fun test3() {
        val columnTitle = "AB"
        val expectedResult = 28
        assertEquals(expectedResult, titleToNumber(columnTitle))
    }

    @Test
    fun test4() {
        val columnTitle = "FXSHRXW"
        val expectedResult = 2147483647
        assertEquals(expectedResult, titleToNumber(columnTitle))
    }

}