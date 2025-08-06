// Last updated: 8/6/2025, 8:55:01 AM
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

        int carry=0;

        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;

        while(l1!=null || l2!=null){

            int sum=carry;
            if(l1!=null){
                sum=sum+l1.val;
            }
            if(l2!=null){
                sum=sum+l2.val;
            }
            ListNode newnode =new ListNode(sum%10);
            carry=sum/10;

            current.next=newnode;
            current=current.next;
            
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }

        if(carry==1){
            ListNode carrynode=new ListNode(carry);
            current.next=carrynode;
        }

        return dummy.next;
        
    }
}