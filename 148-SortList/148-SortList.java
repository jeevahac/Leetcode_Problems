// Last updated: 7/24/2025, 9:25:25 PM
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
         if (head == null) {
            return null;
        }

        ArrayList<Integer> ls=new ArrayList<>();

        ListNode current = head;
        while(current!=null){
            ls.add(current.val);
            current=current.next;
        }
        Collections.sort(ls);

        current=head;

        for(int num: ls){
            current.val=num;
            current=current.next;
        }
        return head;
    }
}