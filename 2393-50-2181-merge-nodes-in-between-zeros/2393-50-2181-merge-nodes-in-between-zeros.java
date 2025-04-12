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
    public ListNode mergeNodes(ListNode head) {
        
        // Create a dummy node to start the new linked list
        ListNode ans = new ListNode(0);

        // Keep a reference to the head of the new list ot return later
        ListNode headAns = ans;

        // Start fro the node after the first 0
        ListNode node = head.next;

        // Variable to store the sum between zeroes
        int sum = 0;
        
        // Traverse the original linked list
        while(node != null){
            
            if(node.val == 0){
                // When a 0 is found, it means one group ended
                // Add the sum of the group as a new node in the result list
                ans.next = new ListNode(sum);

                // Move to the next node in the result list
                ans = ans.next;

                // Reset sum for the next group
                sum = 0;
            }else{
                // Keep adding the values between zeroes
                sum += node.val;
            } 

            // Move to the next node in the input list 
            node = node.next;
        }

        // Retrun the next dummy node (actual start of result list)
        return headAns.next;
    }
}