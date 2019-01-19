package leetcode100;

import java.util.LinkedList;
import java.util.Queue;

public class sortList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return merge(l1,l2);
    }


    private ListNode merge(ListNode l1, ListNode l2){
        ListNode t1 = l1, t2 = l2;
        ListNode res = new ListNode(-1);
        ListNode t = res;
        while(t1 != null || t2 != null){
            if(t1 != null && t2 != null){
                t.next = new ListNode(t1.val < t2.val?t1.val:t2.val);
                t = t.next;
                t1 = t1.next;
                t2 = t2.next;
            }
            else if(t1 != null){
                t.next = t1;
                return res.next;
            }
            else{
                t.next = t2;
                return res.next;
            }
        }
        return res.next;
    }
}
