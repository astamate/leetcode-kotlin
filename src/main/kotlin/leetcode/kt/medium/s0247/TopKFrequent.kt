package leetcode.kt.medium.s0247

object TopKFrequent {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val numsMap = mutableMapOf<Int, Int>()
        nums.forEach {
            numsMap[it] = (numsMap.getOrDefault(it, 0)) + 1
        }
        //Try with PriorityQueue instead
        return numsMap.entries
            .sortedByDescending { it.value }
            .map { it.key }
            .take(k)
            .toIntArray()
    }
}