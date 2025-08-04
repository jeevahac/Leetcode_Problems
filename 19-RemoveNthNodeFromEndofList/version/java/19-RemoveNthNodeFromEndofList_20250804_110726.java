// Last updated: 8/4/2025, 11:07:26 AM
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
    public static int findlength(ListNode head){

        int count=0;

        while(head!=null){
            count++;
            head=head.next;
        }

        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int total_node=findlength(head);

        int index_to_remove=total_node-n;

        ListNode dummy = new ListNode(0); // Dummy node before head
        dummy.next = head;
        ListNode current=dummy;

        for(int i=0;i<index_to_remove;i++){
            current=current.next;
        }
        current.next=current.next.next;

        return dummy.next;

    }
}