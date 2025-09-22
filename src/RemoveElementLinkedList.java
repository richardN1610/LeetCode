public class RemoveElementLinkedList {

    public ListNode removeElements(ListNode head, int val) {
        ListNode prevNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.val == val) {
                if (prevNode == null) {
                    head = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;
                }
                currentNode = currentNode.next;
            }else{
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
