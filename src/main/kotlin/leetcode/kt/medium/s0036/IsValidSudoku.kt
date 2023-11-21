package leetcode.kt.medium.s0036


object IsValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in 0 until 9) {
            val rowSet = mutableSetOf<Char>()
            val colSet = mutableSetOf<Char>()
            val subgridSet = mutableSetOf<Char>()

            for (j in 0 until 9) {
                // rows
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) {
                    return false
                }

                // columns
                if (board[j][i] != '.' && !colSet.add(board[j][i])) {
                    return false
                }

                // 3x3 squares
                val subgridRow = 3 * (i / 3)
                val subgridCol = 3 * (i % 3)
                val subgridVal = board[subgridRow + j / 3][subgridCol + j % 3]

                if (subgridVal != '.' && !subgridSet.add(subgridVal)) {
                    return false
                }
            }
        }

        return true
    }

}
