// Last updated: 8/3/2025, 5:16:05 PM
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