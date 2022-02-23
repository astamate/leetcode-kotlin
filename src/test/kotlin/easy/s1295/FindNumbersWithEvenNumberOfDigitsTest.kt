package easy.s1295

import easy.s1295.FindNumbersWithEvenNumberOfDigits.Companion.findNumbers
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    fun test1() {
        val values = intArrayOf(12,345,2,6,7896)
        val expected = 2
        assertEquals(expected, findNumbers(values))
    }
}