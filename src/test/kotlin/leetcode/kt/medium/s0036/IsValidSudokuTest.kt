package leetcode.kt.medium.s0036

import leetcode.kt.medium.s0036.IsValidSudoku.isValidSudoku
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class IsValidSudokuTest {
    @Test
    fun testIsValidSudoku() {
        val board = arrayOf(
            charArrayOf('.', '.', '.', '.', '5', '.', '.', '1', '.'),
            charArrayOf('.', '4', '.', '3', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '.', '.', '3', '.', '.', '1'),
            charArrayOf('8', '.', '.', '.', '.', '.', '.', '2', '.'),
            charArrayOf('.', '.', '2', '.', '7', '.', '.', '.', '.'),
            charArrayOf('.', '1', '5', '.', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '.', '.', '2', '.', '.', '.'),
            charArrayOf('.', '2', '.', '9', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '4', '.', '.', '.', '.', '.', '.')
        )

        val result = isValidSudoku(board)

        assertFalse(result)
    }
}