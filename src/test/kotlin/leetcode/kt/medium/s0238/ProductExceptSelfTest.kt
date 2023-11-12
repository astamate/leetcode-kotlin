package leetcode.kt.medium.s0238

import leetcode.kt.medium.s0238.ProductExceptSelf.productExceptSelf
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ProductExceptSelfTest{

    @Test
    fun `test basic functionality`() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = intArrayOf(24, 12, 8, 6)
        assertArrayEquals(expected, productExceptSelf(nums))
    }

    @Test
    fun `test single element`() {
        val nums = intArrayOf(1)
        val expected = intArrayOf(1)
        assertArrayEquals(expected, productExceptSelf(nums))
    }

    @Test
    fun `test array with zeroes`() {
        val nums = intArrayOf(1, 2, 0, 4)
        val expected = intArrayOf(0, 0, 8, 0)
        assertArrayEquals(expected, productExceptSelf(nums))
    }

    @Test
    fun `test array with negative numbers`() {
        val nums = intArrayOf(-1, 2, -3, 4)
        val expected = intArrayOf(-24, 12, -8, 6)
        assertArrayEquals(expected, productExceptSelf(nums))
    }

    @Test
    fun `test large array`() {
        val nums = IntArray(100) { 1 } // Array of 100 elements, all 1s.
        val expected = IntArray(100) { 1 } // Array of 100 elements, all 1s.
        assertArrayEquals(expected, productExceptSelf(nums))
    }
}