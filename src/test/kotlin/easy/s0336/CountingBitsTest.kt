package easy.s0336

import easy.s0336.CountingBits.Companion.countBits
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CountingBitsTest {
    @Test
    fun test1() {
        val n = 5
        val output = arrayListOf(0, 1, 1, 2, 1, 2)
        val result = countBits(n)
        for (i in output.indices) {
            assertEquals(output[i], result[i])
        }
    }

}