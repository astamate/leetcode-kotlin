package medium.s0002

import util.ListNode

class AddTwoNumbers {
    companion object {

        fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
            var l1CurrentPosition = l1
            var l2CurrentPosition = l2

            val head = ListNode(((l1?.`val` ?: 0) + (l2?.`val` ?: 0)) % 10)
            var currentPosition = head

            var carry = ((l1?.`val` ?: 0) + (l2?.`val` ?: 0)) / 10

            while (l1CurrentPosition?.next != null || l2CurrentPosition?.next != null) {

                l1CurrentPosition = l1CurrentPosition?.next
                l2CurrentPosition = l2CurrentPosition?.next

                var sum = ((l1CurrentPosition?.`val` ?: 0) + (l2CurrentPosition?.`val` ?: 0) + carry)

                if (sum > 9) {
                    carry = 1
                    sum -= 10
                } else {
                    carry = 0
                }

                currentPosition.next = ListNode(sum)
                currentPosition = currentPosition.next!!
            }
            if (carry != 0)
                currentPosition.next = ListNode(carry)

            return head
        }

    }
}