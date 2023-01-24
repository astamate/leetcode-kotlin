package leetcode.kt.medium.s0532

class FindPairs {
    companion object {
        fun findPairs(nums: IntArray, k: Int): Int {
            if (nums.isEmpty()) return 0

            val numbers = mutableMapOf<Int, Boolean>()
            for (index in nums.indices) {
                numbers[nums[index]] = numbers[nums[index]] != null
            }
            if (k == 0)
                return numbers.filter { it.value }.count()

            return numbers
                .filter { numbers[it.key - k] != null }
                .count()
        }
    }
}