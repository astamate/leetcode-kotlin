package easy.s1089

import java.util.LinkedList

class DuplicateZeros {
    companion object {
        fun duplicateZeros(arr: IntArray) {
            val temp = LinkedList<Int>()

            for(i in arr.indices) {
                if (arr[i] == 0) {
                    repeat(2) { temp.add(0) }
                } else {
                    temp.add(arr[i])
                }
                if (temp.isNotEmpty()) {
                    arr[i] = temp.remove()
                }
            }
        }
    }
}