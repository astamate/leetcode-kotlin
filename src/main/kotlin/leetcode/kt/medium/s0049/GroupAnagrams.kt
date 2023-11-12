package leetcode.kt.medium.s0049

object GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<Int, MutableList<String>>()

        for (str in strs) {
            val key = getKey(str).contentHashCode()
            map[key] = map.getOrDefault(key, mutableListOf()).also {
                it.add(str)
            }
        }

        return map.map { it.value }
    }

    private fun getKey(str: String): IntArray {
        val frequencies = IntArray(26)

        for (ch in str) {
            frequencies[ch - 'a']++
        }
        return frequencies
    }
}