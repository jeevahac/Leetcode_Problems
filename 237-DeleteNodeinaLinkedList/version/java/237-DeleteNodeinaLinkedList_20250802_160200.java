// Last updated: 8/2/2025, 4:02:00 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        node.val=node.next.val;
        node.next=node.next.next;
        
    }
}