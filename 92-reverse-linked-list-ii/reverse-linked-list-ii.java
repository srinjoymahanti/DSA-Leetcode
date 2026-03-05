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
    public void reverse(ListNode head){
        ListNode prevNode=null;
        ListNode currNode=head;
        ListNode nextNode=null;
        while(currNode!=null){
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode a=null,b=null,c=null,d=null;
        int pos=1;
        ListNode temp=head;
        while(temp!=null){
            if(pos==left-1) a=temp;
            if(pos==left) b=temp;
            if(pos==right) c=temp;
            if(pos==right+1) d=temp;
            pos++;
            temp=temp.next;
        }
        if (a!=null) a.next=null;
        if (c!=null) c.next=null;
        reverse(b);
        if (a!=null) a.next=c;
        b.next=d;
        if(a==null) return c;
        return head;
    }
}