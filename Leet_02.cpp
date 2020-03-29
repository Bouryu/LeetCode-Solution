/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* res  = new ListNode(0);
        ListNode* r = res;
        int sum = 0, car = 0;
        while(l1 != NULL && l2 != NULL){
            sum = l1->val + l2->val + car;
            car = sum /10 ;
            r->next = new ListNode(sum % 10);
            r = r->next;
            l1 = l1->next;
            l2 = l2->next;
        }
        while(l1 != NULL || l2 != NULL || car != 0){
            sum = car;
            if(l1 != NULL){
                sum += l1->val;
                l1 = l1->next;
            }
            if(l2 != NULL){
                sum += l2->val;
                l2 = l2->next;
            }
            car = sum /10 ;
            r->next = new ListNode(sum % 10);
            r = r->next;
        }
        return res->next;
    }
};
