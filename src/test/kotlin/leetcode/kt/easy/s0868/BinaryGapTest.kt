package leetcode.kt.easy.s0868

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


internal class BinaryGapTest {

    @Test
    fun test1() {
        val values = 8
        val expected = 0
        assertEquals(expected, BinaryGap.binaryGap(values))
    }

    @Test
    fun test2() {
        val values = 22
        val expected = 2
        assertEquals(expected, BinaryGap.binaryGap(values))
    }

    @Test
    fun test3() {
        val values = 6
        val expected = 0
        assertEquals(expected, BinaryGap.binaryGap(values))
    }

}