// Last updated: 7/24/2025, 9:26:00 PM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ArrayList<Integer> l1=new ArrayList<>();

        while(list1!=null){
            l1.add(list1.val);
            list1=list1.next;
        }

         while(list2!=null){
            l1.add(list2.val);
            list2=list2.next;
        }

        Collections.sort(l1);

        ListNode dummy = new ListNode(0);  // Dummy node to start the linked list
        ListNode current = dummy;

        for (int val : l1) {
            current.next = new ListNode(val);
            current = current.next;
        }

        // Return the merged sorted linked list
        return dummy.next;


        
        
    }
}