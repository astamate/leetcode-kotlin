package leetcode.kt.easy.s0485

import kotlin.math.max

class MaxConsecutiveOnes {
    companion object {

        fun findMaxConsecutiveOnes(nums: IntArray): Int {
            var max = 0
            var currentMax = 0
            nums.forEach {
                if (it == 1) {
                    currentMax++
                } else {
                    max = max(currentMax, max)
                    currentMax = 0
                }
            }
            max = max(currentMax, max)
            return max
        }
    }
}