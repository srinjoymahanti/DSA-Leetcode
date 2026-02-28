/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int sizeA=0;
        int sizeB=0;
        while(tempA!=null){
            tempA=tempA.next;
            sizeA++;
        }
        while(tempB!=null){
            tempB=tempB.next;
            sizeB++;
        }
        int n=Math.abs(sizeA-sizeB);
        ListNode slow;
        ListNode fast;
        if(sizeA<sizeB){
            slow=headA;
            fast=headB;
        }
        else{
            slow=headB;
            fast=headA;
        }
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}