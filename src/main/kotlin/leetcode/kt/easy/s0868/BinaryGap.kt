package leetcode.kt.easy.s0868

object BinaryGap {
    fun binaryGap(n: Int): Int {
        var max=0
        var prevIndex=-1
        val binaryString= Integer.toBinaryString(n)
        for(i in binaryString.indices){
            if(binaryString[i]=='1'){
                if(prevIndex!=-1){
                    max=maxOf(i-prevIndex, max)
                }
                prevIndex=i
            }
        }

        return max
    }
}