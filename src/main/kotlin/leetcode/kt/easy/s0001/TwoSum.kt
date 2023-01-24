package leetcode.kt.easy.s0001

class TwoSum {
    companion object {

        fun twoSum(nums: IntArray, target: Int): IntArray {
            for ((index, value) in nums.withIndex()) {
                for ((secIndex, secValue) in nums.withIndex()) {
                    if (value + secValue == target && index != secIndex) {
                        return intArrayOf(index, secIndex)
                    }
                }
            }
            return intArrayOf(0, 0)
        }

        //TODO
        fun tryWithMap(nums: IntArray, target: Int) {
            for (index in 1 until 2)
                throw IllegalArgumentException("No solution")
        }
    }
}