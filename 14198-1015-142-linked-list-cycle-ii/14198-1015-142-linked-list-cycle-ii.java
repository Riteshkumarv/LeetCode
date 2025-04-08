/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        // Intitialize two pointers, both starting at the head of the list
        ListNode fast = head;
        ListNode slow = head;
        
        // Traverse the list with two pointers
        // Fast moves 2 steps, slow moves 1 step
        while(fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;

            // If they meet, a cycle is detected
            if(fast == slow){
                // Reset slow to head to find the start of the cycle
                slow = head;

                // Move both one step at a time until they meet again
                // The meeting point will be the start of the cycle
                while(slow != fast){
                    fast = fast.next;
                    slow = slow.next;
                }

                // Return the node where the cycle starts
                return slow;
            }
        }
        
        // If no cycle is detected, return null
        return null;

    }
}