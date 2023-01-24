package leetcode.kt.easy.s0336


class CountingBits {
    companion object {
        fun countBits(n: Int): IntArray {
            return IntArray(n + 1) { Integer.bitCount(it) }
        }
    }
}