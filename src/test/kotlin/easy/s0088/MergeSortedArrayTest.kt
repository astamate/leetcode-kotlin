package easy.s0088

import easy.s0088.MergeSortedArray.Companion.merge
import easy.s0977.SquaresOfASortedArray
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MergeSortedArrayTest{

    @Test
    fun test1() {
        val nums1 = intArrayOf(1,2,3,0,0,0)
        val m = 3
        val nums2 = intArrayOf(2,5,6)
        val n = 3
        val expect = intArrayOf(1,2,2,3,5,6)
        merge(nums1,m,nums2,n)
        assertTrue(nums1.contentEquals(expect))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(0)
        val m = 0
        val nums2 = intArrayOf(1)
        val n = 1
        val expect = intArrayOf(1)
        merge(nums1,m,nums2,n)
        assertTrue(nums1.contentEquals(expect))
    }
}