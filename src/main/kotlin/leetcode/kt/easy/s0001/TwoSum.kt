package leetcode.kt.easy.s0001

class TwoSum {
    companion object {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val map = mutableMapOf<Int, Int>()
            nums.forEachIndexed { index, i ->
                map[i]?.let { return intArrayOf(it, index) }
                map[target - i] = index
            }
            return intArrayOf()
        }
    }
}