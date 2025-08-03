// Last updated: 8/3/2025, 5:00:17 PM
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

     // reverse from the middle to end
        public static ListNode reverse(ListNode head){

            ListNode prev=null;
            ListNode curr=head;
            ListNode next=null;

            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }
    public boolean isPalindrome(ListNode head) {
        

        if(head==null || head.next==null){
            return true;
        }

        //Finding the middle node;

        ListNode slow=head, fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        } 

        ListNode firsthalf=head;
        ListNode secondhalf=reverse(slow);

       

        while(secondhalf!=null){
            if(firsthalf.val!=secondhalf.val){
                return false;
            }
            firsthalf=firsthalf.next;
            secondhalf=secondhalf.next;
        }
        return true;

    }
}