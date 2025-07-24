// Last updated: 7/24/2025, 9:25:09 PM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {

    if(head==NULL){
        return head;
    }
    while(head!=NULL && head->val==val){
        head=head->next;
    }

    struct ListNode *temp=head;
    while(temp!=NULL && temp->next!= NULL){
        if(temp->next->val==val){
            temp->next=temp->next->next;
        }
        else{
            temp=temp->next;
        }
    }


    return head;
    
}