// Last updated: 7/24/2025, 9:25:12 PM
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode temp = head;
        if(head == null){
            return null;
        }
        while(temp != null && temp.next != null ){
            if(temp.next.val == val){
                temp.next =  temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        
        // Handle the case where the head node itself needs to be removed
        if (head.val == val) {
            head = head.next;
        }
        
        return head;
    }
}
