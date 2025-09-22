public class LinkedListAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode();
        ListNode ans = newList;
        boolean isTenth = false;

        while(l1 != null || l2 != null){
            ListNode newNode = new ListNode();
            if(l2 == null){
                l2 = new ListNode(0);
            }
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            newNode.val = l1.val + l2.val;
            if (isTenth){
                newNode.val += 1;
            }
            if(newNode.val >= 10 ){
                isTenth = true;
            }else{
                isTenth = false;
            }
            newNode.val = newNode.val%10;

            l1 = l1.next;
            l2 = l2.next;

            newList.next = newNode;
            newList = newList.next;
        }
        if (isTenth){
            ListNode nextNode = new ListNode(1);
        }

        return ans.next;
    }
}
