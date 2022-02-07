package easy.s0389

import kotlin.math.abs


class FindTheDifference {
    companion object {
        fun findTheDifference(s: String, t: String): Char {
            return (abs(s.sumOf { it.code } - t.sumOf { it.code })).toChar()
        }
    }
}