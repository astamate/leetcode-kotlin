package medium.s0005

import medium.s0005.LongestPalindrome.Companion.longestPalindrome
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class LongestPalindromeTest {
    @Test
    fun test1() {
        val s = "babad"
        val result = "bab"
        val result2 = "aba"
        assertTrue(result == longestPalindrome(s) || result2 == longestPalindrome(s))
    }

    @Test
    fun test2() {
        val s = "a"
        val result = "a"
        assertEquals(result,longestPalindrome(s) )
    }
}