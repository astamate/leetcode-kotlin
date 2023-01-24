package leetcode.kt.medium.s0003

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LengthOfLongestSubstringTest {

    @Test
    fun test1() {
        assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"))
    }

    @Test
    fun test2() {
        assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"))
    }

    @Test
    fun test3() {
        assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("dvdf"))
    }
}