package easy.s0389

import easy.s0389.FindTheDifference.Companion.findTheDifference
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FindTheDifferenceTest{
    @Test
    fun test1(){
        val s = "abcd"
        val t = "abcde"
         assertEquals("e".toCharArray()[0], findTheDifference(s,t))
    }
}