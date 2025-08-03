// Last updated: 8/3/2025, 5:29:40 PM
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // To attach at end of odd list

        while (even != null && even.next != null) {
            odd.next = even.next;  // connect odd to next odd node
            odd = odd.next;        // move odd pointer

            even.next = odd.next;  // connect even to next even node
            even = even.next;      // move even pointer
        }

        odd.next = evenHead; // attach even list after odd list
        return head;
    }
}