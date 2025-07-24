// Last updated: 7/24/2025, 9:25:06 PM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {

    struct ListNode *current=head;
    struct ListNode *previous=NULL,*next=NULL;

    while(current!=NULL){
        next=current->next;
        current->next=previous;
        previous=current;
        current=next;
    }
    return previous;

    
}