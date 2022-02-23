package easy.s1089

import easy.s1089.DuplicateZeros.Companion.duplicateZeros
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class DuplicateZerosTest {

    @Test
    fun test1() {
        val values = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)
        val expected = intArrayOf(1, 0, 0, 2, 3, 0, 0, 4)
        duplicateZeros(values)
        assertTrue { values.contentEquals(expected) }
    }
}