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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode temp1=dummy1;
        ListNode temp2=dummy2;
        ListNode t=head;
        while(t!=null){
            if(t.val<x){
                temp1.next=t;
                temp1=temp1.next;
            }
            else{
                temp2.next=t;
                temp2=temp2.next;
            }
            t=t.next;
        }
        temp2.next=null;
        temp1.next=dummy2.next;
        return dummy1.next;
    }
}