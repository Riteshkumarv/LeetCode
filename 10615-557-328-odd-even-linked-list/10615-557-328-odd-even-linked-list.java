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
    public ListNode oddEvenList(ListNode head) {

        // If the list is empty, return as is 
        if(head == null){
            return head;
        }
        
        // Initialize pointers for odd and even nodes
        ListNode odd = head; // Points to the first node (odd index)
        ListNode even = head.next; // Points to the second node (even index)
        ListNode evenHead = even; // Store the head of even nodes to link later

        // Rearrange the nodes into odd and even indexed groups
        while(even != null && even.next != null){
            // Link odd node to the node odd node
            odd.next = odd.next.next;
            // Link even node to the next even node
            even.next = even.next.next;
           
            // Move the pointers forward
            odd = odd.next;
            even = even.next;
        }
        // Attach even nodes after odd nodes
        odd.next = evenHead;

        // Return the modified list
        return head;
    }
}