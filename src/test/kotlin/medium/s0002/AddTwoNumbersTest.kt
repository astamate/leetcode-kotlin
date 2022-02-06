package medium.s0002

import medium.s0002.AddTwoNumbers.Companion.addTwoNumbers
import org.junit.jupiter.api.Test

import util.ListNode
import kotlin.test.assertEquals

internal class AddTwoNumbersTest {

    @Test
    fun test1() {
        val l1 = ListNode(2,4,3)
        val l2 = ListNode(5,6,4)

        val expected = ListNode(7,0,8)

        assertEquals(expected.toString(), addTwoNumbers(l1, l2).toString())
    }

    @Test
    fun test2() {
        val l1 = ListNode(9,9,9,9,9,9,9)
        val l2 = ListNode(9,9,9,9)

        val expected = ListNode(8,9,9,9,0,0,0,1)
        assertEquals(expected.toString(), addTwoNumbers(l1, l2).toString())
    }

    @Test
    fun test3() {
        val l1 = ListNode(2,4,9)
        val l2 = ListNode(5,6,4,9)

        val expected = ListNode(7,0,4,0,1)

        assertEquals(expected.toString(), addTwoNumbers(l1, l2).toString())
    }

    @Test
    fun test4() {
        val l1 = ListNode(0,8,8,8,8,2,9,3,1,1)
        val l2 = ListNode(0,9,1,5,5,5,1,1,6)

        val expected = ListNode(0,7,0,4,4,8,0,5,7,1)

        assertEquals(expected.toString(), addTwoNumbers(l1, l2).toString())
    }
}