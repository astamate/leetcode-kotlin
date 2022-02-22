package easy.s0171


class ExcelSheetColumnNumber {
    companion object {

        fun titleToNumber(columnTitle: String): Int {
            var result = 0
            columnTitle.forEach { char ->
                result = result * 26 + (char.code - 64)
            }
            return result
        }
    }
}