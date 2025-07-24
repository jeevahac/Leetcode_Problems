// Last updated: 7/24/2025, 9:25:26 PM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {

    struct ListNode *slow=head;
    struct ListNode *fast=head;

    while(fast!=NULL && fast->next!=NULL){
        
        slow=slow->next;
        fast=fast->next->next;
        if(slow==fast){
            return true;
        }
    }
    return false;
}