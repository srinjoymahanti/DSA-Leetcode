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
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prevNode=null;
        ListNode currNode=head;
        ListNode nextNode=head;
        while(currNode!=null){
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        return prevNode;
    }
    public void reorderList(ListNode head) {
        ListNode leftMiddle=middle(head);
        ListNode newHead=leftMiddle.next;
        leftMiddle.next=null;
        newHead=reverse(newHead);
        ListNode next1=head;
        ListNode next2=newHead;
        ListNode t1=head;
        ListNode t2=newHead;
        while(t2!=null){
            next1=next1.next;
            t1.next=t2;
            t1=next1;
            next2=next2.next;
            t2.next=t1;
            t2=next2;
        }
    }
}