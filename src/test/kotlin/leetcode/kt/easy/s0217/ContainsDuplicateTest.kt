package leetcode.kt.easy.s0217

import leetcode.kt.easy.s0217.ContainsDuplicate.containsDuplicate
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ContainsDuplicateTest {

    @Test
    fun test1() {
        val input = intArrayOf(1, 2, 3, 1)
        val output = true
        assertEquals(output, containsDuplicate(input))
    }
    @Test
    fun test2() {
        val input = intArrayOf(1,2,3,4)
        val output = false
        assertEquals(output, containsDuplicate(input))
    }
    @Test
    fun test3() {
        val input = intArrayOf(1,1,1,3,3,4,3,2,4,2)
        val output = true
        assertEquals(output, containsDuplicate(input))
    }
}