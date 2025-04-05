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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Edge case: if the list is empty, return null
        if(head == null){
            return null;
        }

        // Initialize two pointers, both starting from head
        ListNode fast = head;
        ListNode slow = head;

        // Move the first pointer 'n' steps ahead
        while(n > 0){
            n--;
            fast = fast.next;
        }

        // If fast becomes null, it means we need to remvoe the first node
        if(fast == null){
            return head.next;
        }

        // Move both pointers until fast reaches the last node
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return head;
    }
}