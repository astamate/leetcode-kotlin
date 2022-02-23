package easy.s0088

class MergeSortedArray {
    companion object {
        fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
            var maxM = m - 1
            var maxN = n - 1
            for (i in nums1.indices.reversed()) {
                if (maxM < 0 || maxN >= 0 && nums1[maxM] < nums2[maxN]) {
                    nums1[i] = nums2[maxN]
                    maxN--
                } else {
                    nums1[i] = nums1[maxM]
                    maxM--
                }
            }
        }
    }
}