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
    public ListNode sortList(ListNode head) {
        // ListNode temp=head;
        // int size=0;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        // for(int i=0;i<size;i++){
        //     temp=head;
        //     while(temp.next!=null){
        //         if(temp.val>temp.next.val){
        //             int t=temp.val;
        //             temp.val=temp.next.val;
        //             temp.next.val=t;
        //         }
        //         temp=temp.next;
        //     }
        // }
        // return head;

        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prevSlow=null;
        while(fast!=null && fast.next!=null){
            prevSlow=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prevSlow.next=null;
        head=sortList(head);
        slow=sortList(slow);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode temp1=head;
        ListNode temp2=slow;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        if(temp1==null) temp.next=temp2;
        else temp.next=temp1;
        return dummy.next;
    }
}