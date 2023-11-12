package leetcode.kt.easy.s0242

object ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val count = IntArray(26)

        s.forEach { count[it.code - 97]++ }
        t.forEach { count[it.code - 97]-- }

        return count.none { it != 0 }
    }
}