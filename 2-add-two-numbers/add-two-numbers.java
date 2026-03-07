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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null){
            int val1=0;
            int val2=0;
            if(l1!=null) val1=l1.val;
            if(l2!=null) val2=l2.val;
            int newVal=val1+val2+carry;
            if(newVal>9) carry=1;
            else carry=0;
            ListNode t=new ListNode(newVal%10);
            temp.next=t;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            temp=temp.next;
        }
        if(carry==1){
            ListNode t=new ListNode(carry);
            temp.next=t;
            temp=temp.next;
        }
        return dummy.next;
    }
}