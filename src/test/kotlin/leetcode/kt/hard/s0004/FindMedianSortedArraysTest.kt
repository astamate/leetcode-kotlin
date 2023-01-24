package leetcode.kt.hard.s0004

import leetcode.kt.hard.s0004.FindMedianSortedArrays.Companion.findMedianSortedArrays
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FindMedianSortedArraysTest{
    @Test
    fun test1(){
        val nums1 = intArrayOf(1,3)
        val nums2 = intArrayOf(2)

        val result = 2.00000
        assertEquals(result,findMedianSortedArrays(nums1,nums2))
    }
}