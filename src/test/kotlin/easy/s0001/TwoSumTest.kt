package easy.s0001

import easy.s0001.TwoSum.Companion.twoSum
import org.junit.jupiter.api.Test

import kotlin.test.assertEquals

internal class TwoSumTest {
    @Test
    fun test1() {
        val values = IntArray(5) { it }
        val expectedResult = intArrayOf(3, 4)
        val result = twoSum(values, 7)
        assertEquals(expectedResult[0], result[0])
        assertEquals(expectedResult[1], result[1])
    }

    @Test
    fun test2() {
        val values = intArrayOf(3, 2, 4)
        val expectedResult = intArrayOf(1, 2)
        val result = twoSum(values, 6)
        assertEquals(expectedResult[0], result[0])
        assertEquals(expectedResult[1], result[1])
    }

    @Test
    fun test3() {
        val values = intArrayOf(3, 3)
        val expectedResult = intArrayOf(0, 1)
        val result = twoSum(values, 6)
        assertEquals(expectedResult[0], result[0])
        assertEquals(expectedResult[1], result[1])
    }
}