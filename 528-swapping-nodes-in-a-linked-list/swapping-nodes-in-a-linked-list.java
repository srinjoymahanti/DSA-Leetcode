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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
            fast=fast.next;
        }
        fast=fast.next;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        int t=temp.val;
       temp.val=slow.val;
       slow.val=t;
       return head;

    //    int size=0;
    //    ListNode temp=head;
    //    while(temp!=null){
    //     size++;
    //     temp=temp.next;
    //    }
    //    int firstIdx=k;
    //    int lastIdx=size-k+1;
    //    ListNode fast=head;
    //    ListNode slow=head;
    //    for(int i=1;i<lastIdx;i++){
    //     fast=fast.next;
    //    }
    //    for(int i=1;i<firstIdx;i++){
    //     slow=slow.next;
    //    }
    //    int t=fast.val;
    //    fast.val=slow.val;
    //    slow.val=t;
    //    return head;
    }
}