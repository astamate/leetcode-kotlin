package leetcode.kt.easy.s1346

import leetcode.kt.easy.s1346.CheckIfNAndItsDoubleExist.Companion.checkIfExist
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CheckIfNAndItsDoubleExistTest {
    @Test
    fun test1() {
        val input = intArrayOf(10, 2, 5, 3)
        val output = true
        assertEquals(output, checkIfExist(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(10,2,5,3)
        val output = true
        assertEquals(output, checkIfExist(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(3,1,7,11)
        val output = false
        assertEquals(output, checkIfExist(input))
    }

    @Test
    fun test4() {
        val input = intArrayOf(10,2,5,3)
        val output = true
        assertEquals(output, checkIfExist(input))
    }

    @Test
    fun test5() {
        val input = intArrayOf(-2,0,10,-19,4,6,-8)
        val output = false
        assertEquals(output, checkIfExist(input))
    }

    @Test
    fun test6() {
        val input = intArrayOf(0,0)
        val output = true
        assertEquals(output, checkIfExist(input))
    }

}