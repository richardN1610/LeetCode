public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        int numNodes = 0;
        while(currentNode!=null){
            numNodes++;
            currentNode = currentNode.next;
        }

        int counter = 0;
        currentNode = head;
        ListNode prevNode = null;
        while(currentNode != null){
            if(counter == numNodes-n){
                if (prevNode == null) {
                    head = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;
                }
            }else{
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            counter++;
        }

        return head;
    }
}
