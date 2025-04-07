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
    public boolean hasCycle(ListNode head) {
        
        // Function to detect a cycle in a linked list using Flody's Cycle Detection Algorithm (Tortoise and Hare)
        if(head == null || head.next == null) return false;
        
        // Initialize two pointers, fast and slow
        ListNode fast = head;                                                                                                                                                                    ;
        ListNode slow = head;

        // Traverse the list
        while(fast != null && fast.next != null){
            fast = fast.next.next; // fast pointer moves two steps
            slow = slow.next; // slow pointer moves one step
            
            // If fast and slow meet, there's a cycle
            if(fast == slow) return true;
        }

        // If we reach the end of the list, there's no cycle
        return false;
    }
}