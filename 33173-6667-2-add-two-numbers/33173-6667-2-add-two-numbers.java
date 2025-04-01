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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // Dummy node to simplify the result list handling
        ListNode ans = new ListNode(0);
        ListNode node = ans;
        int carry = 0;

        // Loop until both lists are fully traversed and no carry remains
        while(l1 != null || l2 != null || carry != 0){
            
            int sum = carry; // Start with carry fully traversed and no carry remains

            // Add value from l1 if available and move to next node
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            //Add value from l2 if available and move to next node
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            // Calulate new carry for next iteration
            carry = sum / 10;

            // Store the current digit (sum % 10) in the result list
            node.next = new ListNode(sum % 10);
            node = node.next;

        }
        // Return the result list, skipping the initial dummy node
        return ans.next;
    }
}