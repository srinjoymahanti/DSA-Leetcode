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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode temp=head;
        // int size=0;
        // while(temp!=null){
        //     temp=temp.next;
        //     size++;
        // }
        // temp=head;
        // int idx=size-n;
        // if(idx==0) return head.next;
        // for(int i=1;i<idx;i++){
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        // return head;

        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null) return head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}