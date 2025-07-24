// Last updated: 7/24/2025, 9:25:00 PM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode *reverse_list(struct ListNode *head){
    struct ListNode *curr=head;
    struct ListNode *prev=NULL;
    struct ListNode *next=NULL;

    while(curr!=NULL){
        next=curr->next;
        curr->next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
}
bool isPalindrome(struct ListNode* head) {

    if(head==NULL||head->next==NULL){
        return true;
    }

    struct ListNode *slow=head;
    struct ListNode *fast=head;

    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }

    struct ListNode *secondhalf=reverse_list(slow);

    struct ListNode *firsthalf=head;

    bool palindrome=true;

    while(secondhalf!=NULL){
        if(firsthalf->val!=secondhalf->val){
            palindrome=false;
            break;
        }
        secondhalf=secondhalf->next;
        firsthalf=firsthalf->next;
    }

    return palindrome;


    
}