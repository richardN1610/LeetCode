public class LinkedListDeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val; //updating the value
        node.next = node.next.next; //updating next node
    }
}
