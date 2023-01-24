package leetcode.kt.medium.s0003

import kotlin.math.max

class LengthOfLongestSubstring {
    companion object {
        fun lengthOfLongestSubstring(s: String): Int {
            val chars: MutableMap<Char, Int> = mutableMapOf()
            var maxLength = 0
            var start = 0
            for (index in s.indices) {
                if (chars[s[index]] != null) {
                    start = max(chars[s[index]]!!, start)
                }
                maxLength = max(maxLength, index - start + 1)
                chars[s[index]] = index + 1
            }
            return maxLength
        }
    }
}
