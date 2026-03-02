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
    public ListNode reverseList(ListNode head) {
        //Recursivemethod
        if(head==null || head.next==null) return head;
        ListNode a=head.next;
        ListNode newHead=reverseList(a);
        a.next=head;
        head.next=null;
        return newHead;

        // //Iterative method
        // ListNode prevNode=null;
        // ListNode currNode=head;
        // ListNode nextNode=head;
        // while(currNode!=null){
        //     nextNode=currNode.next;
        //     currNode.next=prevNode;
        //     prevNode=currNode;
        //     currNode=nextNode;
        // }
        // return prevNode;
    }
}