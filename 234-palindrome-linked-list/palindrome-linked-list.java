/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode newHead=new ListNode(head.val);
        ListNode t1=head;
        ListNode t2=newHead;
        while(t1!=null){
            ListNode temp=new ListNode(t1.val);
            t1=t1.next;
            t2.next=temp;
            t2=t2.next;
        }
        newHead=reverse(newHead);
        t1=head;
        t2=newHead;
        while(t1!=null){
            if(t1.val!=t2.val) return false;
            t1=t1.next;
            t2=t2.next;
        }
        return true;
    }
}