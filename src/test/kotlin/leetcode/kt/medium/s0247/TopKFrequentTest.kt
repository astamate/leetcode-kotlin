package leetcode.kt.medium.s0247

import leetcode.kt.medium.s0247.TopKFrequent.topKFrequent
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TopKFrequentTest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val k = 2
        val expected = intArrayOf(1, 2)
        val result = topKFrequent(nums, k)

        assertTrue( result.all { expected.contains(it) })
    }

    @Test
    fun `test single element`() {
        val nums = intArrayOf(1)
        val k = 1
        val expected = intArrayOf(1)
        assertArrayEquals(expected, topKFrequent(nums, k))
    }

    @Test
    fun `test all unique elements`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val k = 2
        // Expected can vary based on your implementation specifics.
        val expected = intArrayOf(4, 5) // Or any two elements from the array.
        assertArrayEquals(expected, topKFrequent(nums, k))
    }

    @Test
    fun `test large k value`() {
        val nums = intArrayOf(1, 2, 2, 3, 3, 3)
        val k = 10
        val expected = intArrayOf(1, 2, 3) // All elements, as k is larger than unique elements count.
        assertArrayEquals(expected, topKFrequent(nums, k))
    }

    @Test
    fun `test zero k value`() {
        val nums = intArrayOf(1, 2, 3)
        val k = 0
        val expected = intArrayOf()
        assertArrayEquals(expected, topKFrequent(nums, k))
    }

    @Test
    fun `test negative numbers`() {
        val nums = intArrayOf(-1, -1, -2, -2, -2, -3)
        val k = 2
        val expected = intArrayOf(-2, -1)
        val result = topKFrequent(nums, k)

        assertTrue( result.all { expected.contains(it) })
    }
}