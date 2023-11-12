package leetcode.kt.easy.s0242

import leetcode.kt.easy.s0242.ValidAnagram.isAnagram
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidAnagramTest {

    @Test
    fun test0() {
        val string1 = "anagram"
        val string2 = "nagaram"
        val output = true
        assertEquals(output, isAnagram(string1, string2))
    }
    @Test
    fun test1() {
        val string1 = "rat"
        val string2 = "car"
        val output = false
        assertEquals(output, isAnagram(string1, string2))
    }

    @Test
    fun test2() {
        val string1 = "a"
        val string2 = "ab"
        val output = false
        assertEquals(output, isAnagram(string1, string2))
    }
}