package easy.s1295

class FindNumbersWithEvenNumberOfDigits {
    companion object {
        fun findNumbers(nums: IntArray) = nums.count { num ->
            num.toString().count() % 2 == 0
        }
    }
}