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
    public ListNode deleteMiddle(ListNode head) {
        // If the list is empty or has only one node, return null (nothing to delete or no middle)
        if(head == null || head.next == null){
            return null;
        }
        
        // Initialize two pointers: slow and fast
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // To keep track of the node before slow
        
        // Move fast by 2 steps and slow by 1 step until fast reaches the end
        // This way, slow will point to the middle node
        while(fast != null && fast.next != null){
            prev = slow; // Save the node before the middle
            slow = slow.next; // Move slow one step
            fast = fast.next.next; // Move fast two steps
        }
        // Delete the middle node by skipping it
        prev.next = prev.next.next;

        // Retrun the modified list
        return head;
    }
}