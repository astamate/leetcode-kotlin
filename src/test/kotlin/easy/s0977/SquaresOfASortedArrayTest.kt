package easy.s0977

import easy.s0977.SquaresOfASortedArray.Companion.sortedSquares
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class SquaresOfASortedArrayTest {

    @Test
    fun test1() {
        val values = intArrayOf(-7, -3, 2, 3, 11)
        val expect = intArrayOf(4, 9, 9, 49, 121)
        assertTrue(sortedSquares(values).contentEquals(expect))
    }
}