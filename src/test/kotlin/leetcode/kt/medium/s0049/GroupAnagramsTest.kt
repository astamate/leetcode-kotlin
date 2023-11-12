package leetcode.kt.medium.s0049

import leetcode.kt.medium.s0049.GroupAnagrams.groupAnagrams
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GroupAnagramsTest {

    private fun sortResult(list: List<List<String>>): List<List<String>> {
        return list.map { it.sorted() }.sortedBy { it.firstOrNull() ?: "" }
    }

    @Test
    fun `test basic functionality`() {
        val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        val expected = listOf(listOf("eat", "tea", "ate"), listOf("tan", "nat"), listOf("bat"))
        val result = groupAnagrams(input)

        assertEquals(sortResult(expected), sortResult(result))
    }

    @Test
    fun `test empty strings`() {
        val input = arrayOf("", "", "")
        val expected = listOf(listOf("", "", ""))
        val result = groupAnagrams(input)

        assertEquals(sortResult(expected), sortResult(result))
    }


    @Test
    fun `test single characters`() {
        val input = arrayOf("a", "b", "c", "a")
        val expected = listOf(listOf("a", "a"), listOf("b"), listOf("c"))
        val result = groupAnagrams(input)

        assertEquals(sortResult(expected), sortResult(result))
    }

    @Test
    fun `test no anagrams`() {
        val input = arrayOf("abc", "def", "ghi")
        val expected = listOf(listOf("abc"), listOf("def"), listOf("ghi"))
        val result = groupAnagrams(input)

        assertEquals(sortResult(expected), sortResult(result))
    }

    @Test
    fun `test mixed length strings`() {
        val input = arrayOf("eat", "playing", "ate", "tea", "silent", "listen")
        val expected = listOf(listOf("eat", "ate", "tea"), listOf("playing"), listOf("silent", "listen"))
        val result = groupAnagrams(input)

        assertEquals(sortResult(expected), sortResult(result))
    }
}