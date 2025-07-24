// Last updated: 7/24/2025, 9:25:36 PM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {

    struct ListNode *ptr=head;
    if(ptr==NULL){
        return head;
    }
    while(ptr->next!=NULL){
        if(ptr->val==ptr->next->val){
            ptr->next=ptr->next->next;
        }
        else{
            ptr=ptr->next;
        }
    }
    return head;
    
}