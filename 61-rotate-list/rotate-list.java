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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        for(int i=1;i<=k%size;i++){
            fast=fast.next;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        fast.next=head;
            head=slow.next;
            slow.next=null;
        return head;
    }
}