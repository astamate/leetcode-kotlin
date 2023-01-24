package leetcode.kt.easy.s0027

class RemoveElement {
    companion object {

        fun removeElement(nums: IntArray, `val`: Int): Int {
            var newIndex = 0
            nums.forEach {
                if (it != `val`) {
                    nums[newIndex] = it
                    newIndex++
                }
            }
            return newIndex
        }
    }
}