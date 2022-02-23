package easy.s0977

class SquaresOfASortedArray {
    companion object {
        fun sortedSquares(nums: IntArray): IntArray {
            return nums.map { num -> num*num }.sorted().toIntArray()
        }
    }
}