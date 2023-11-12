package leetcode.kt.easy.s0217

object ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        nums.forEach {
            if(!set.add(it)){
                return true
            }
        }
        return false
    }
}