package leetcode.kt.easy.s1346


class CheckIfNAndItsDoubleExist {
    companion object {
        fun checkIfExist(arr: IntArray): Boolean {
            for (i in arr.indices)
                for (j in arr.indices)
                    if (i != j && arr[i] == 2 * arr[j])
                        return true
            return false
        }
    }
}