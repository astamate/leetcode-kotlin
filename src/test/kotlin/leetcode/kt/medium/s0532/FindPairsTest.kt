package leetcode.kt.medium.s0532

import leetcode.kt.medium.s0532.FindPairs.Companion.findPairs
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FindPairsTest{
    @Test
    fun test1(){
        val nums = intArrayOf(3,1,4,1,5)
        val k = 2
        val result = 2
        assertEquals(result,findPairs(nums,k))
    }

    @Test
    fun test2(){
        val nums = intArrayOf(1,3,1,5,4)
        val k = 0
        val result = 1
        assertEquals(result,findPairs(nums,k))
    }
}