package util

class ListNode(var `val`: Int, vararg child:Int) {
    var next: ListNode? = null

    init {
        if(child.isNotEmpty()) {
            next = ListNode(child[0], *child.drop(1).toIntArray())
        }
    }

    override fun toString(): String {
        var result: String = `val`.toString()
        var nextNode = next
        while (nextNode != null) {
            result += ", " + nextNode.`val`.toString()
            nextNode = nextNode.next
        }
        return result
    }
}