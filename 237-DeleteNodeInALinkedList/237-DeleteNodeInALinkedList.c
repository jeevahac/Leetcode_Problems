// Last updated: 7/24/2025, 9:24:58 PM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {

    node->val=node->next->val;
    node->next=node->next->next;
    
}