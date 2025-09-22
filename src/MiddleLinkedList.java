public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        int numNodes = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            numNodes++;
            currentNode =currentNode.next;
        }
        int middleNode = numNodes/2;
        while(head != null && middleNode > 0){
            middleNode--;
            head = head.next;
        }
        return head;
    }
}
