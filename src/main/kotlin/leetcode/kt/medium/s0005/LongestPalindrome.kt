package leetcode.kt.medium.s0005

import kotlin.math.max

class LongestPalindrome {
    companion object {
        fun longestPalindrome(s: String): String {
            var start = 0
            var end = 0
            for (index in s.indices) {
                val rightIsIndex = expandAroundCenter(s, index, index)
                val centerIsIndex = expandAroundCenter(s, index, index + 1)
                val max = max(rightIsIndex, centerIsIndex)
                if (max > end - start) {
                    start = index - (max - 1) / 2
                    end = index + max / 2
                }
            }
            return s.substring(start, end + 1)
        }

        private fun expandAroundCenter(s: String, l: Int, r: Int): Int {
            var start = l
            var end = r
            while (start >= 0 && end < s.length && s[start] == s[end]) {
                start--
                end++
            }
            return end - start - 1
        }
    }
}