import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLinkedList {

    public ListNode sortList(ListNode head) {
        //  4,2,1,3 -> 1,2,3,4
        //p c
        //  4,2,1,3 -> 1,2,3,4
        //  p c
        List<Integer> nodeVal = new ArrayList<>();
        while (head != null){
            nodeVal.add(head.val);

            head = head.next;
        }
        Collections.sort(nodeVal);
        if (nodeVal.isEmpty()){
            return null;
        }
        ListNode ans = new ListNode(nodeVal.getFirst());
        head = ans;
        for(int i = 1;i< nodeVal.size();i++){
            ListNode newNode = new ListNode(nodeVal.get(i));
            ans.next = newNode;
            ans = ans.next;
        }
        return head;
    }

}
