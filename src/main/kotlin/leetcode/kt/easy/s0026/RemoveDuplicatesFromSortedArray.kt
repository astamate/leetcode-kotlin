package leetcode.kt.easy.s0026

class RemoveDuplicatesFromSortedArray {
    companion object {
        fun removeDuplicates(nums: IntArray): Int {
            var newIndex = 0
            nums.forEach {
                if ( newIndex == 0 || nums[newIndex-1] != it) {
                    nums[newIndex] = it
                    newIndex++
                }
            }
            return newIndex
        }
    }
}