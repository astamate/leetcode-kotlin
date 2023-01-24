package leetcode.kt.easy.s0485

import leetcode.kt.easy.s0485.MaxConsecutiveOnes.Companion.findMaxConsecutiveOnes
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MaxConsecutiveOnesTest {

    @Test
    fun test1() {
        val values = intArrayOf(1, 0, 1, 1, 0, 1)
        val expected = 2
        assertEquals(expected, findMaxConsecutiveOnes(values))
    }
}