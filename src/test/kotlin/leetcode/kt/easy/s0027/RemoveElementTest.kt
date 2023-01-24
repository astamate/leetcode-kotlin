package leetcode.kt.easy.s0027

import leetcode.kt.easy.s0027.RemoveElement.Companion.removeElement
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.Arrays.sort

internal class RemoveElementTest {

    @Test
    fun test1() {
        val input = intArrayOf(3, 2, 2, 3)
        val value = 3
        val expectedArray = intArrayOf(2, 2)
        val expectedResult = 2
        val removeElements = removeElement(input, value)
        sort(input, 0, removeElements)
        assertEquals(expectedResult, removeElements)
        for (i in 0..expectedArray.size - (removeElements+1))
            assertEquals(expectedArray[i], input[i])
    }

    @Test
    fun test2() {
        val input = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val value = 2
        val expectedArray = intArrayOf(0, 1, 4, 0, 3)
        val expectedResult = 5
        val removeElements = removeElement(input, value)
        sort(input, 0, removeElements)
        assertEquals(expectedResult, removeElements)
        for (i in 0..expectedArray.size - (removeElements+1))
            assertEquals(expectedArray[i], input[i])

    }

}