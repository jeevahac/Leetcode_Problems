// Last updated: 8/11/2025, 8:55:01 AM
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
