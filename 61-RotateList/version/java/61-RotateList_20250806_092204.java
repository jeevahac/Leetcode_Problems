// Last updated: 8/6/2025, 9:22:04 AM
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
    public static ListNode findlastnode(ListNode temp, int k){

        int count=1;
        while(temp!=null){
            if(count==k){
                return temp;
            }
            count++;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null||k==0){
            return head;
        }

        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }

         if(k%len==0){
            return head;
        }

        k=k%len;
        temp.next=head;

        ListNode lastnode =findlastnode(head,len-k);

        head=lastnode.next;
        lastnode.next=null;
        
        return head;
    }
}