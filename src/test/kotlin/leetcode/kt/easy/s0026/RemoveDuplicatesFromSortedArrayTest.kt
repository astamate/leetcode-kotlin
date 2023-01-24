package leetcode.kt.easy.s0026

import leetcode.kt.easy.s0026.RemoveDuplicatesFromSortedArray.Companion.removeDuplicates
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class RemoveDuplicatesFromSortedArrayTest {

    @Test
    fun test1() {
        val input = intArrayOf(1, 1, 2)
        val expectedArray = intArrayOf(1, 2)
        val expectedResult = 2
        val removeElements = removeDuplicates(input)
        Assertions.assertEquals(expectedResult, removeElements)
        for (i in 0..expectedArray.size - (removeElements + 1))
            Assertions.assertEquals(expectedArray[i], input[i])
    }

    @Test
    fun test2() {
        val input = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val expectedArray = intArrayOf(0, 1, 2, 3, 4)
        val expectedResult = 5
        val removeElements = removeDuplicates(input)
        Assertions.assertEquals(expectedResult, removeElements)
        for (i in 0..expectedArray.size - (removeElements + 1))
            Assertions.assertEquals(expectedArray[i], input[i])
    }
}