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
    public ListNode deleteDuplicates(ListNode head) {
        
        // Initialize a pointer to traverse the linked list
        ListNode node = head;

        // Traverse the linked list while there are nodes to check
        while(node != null && node.next != null){

            // If the current node value is equal to the next node value, remove the duplicate 
            if(node.val == node.next.val){
                node.next = node.next.next; // Skip the duplicate node 
            }else{
                node = node.next; // Move to the next node if no duplicate is found
            }
        }
        // Return the modified linked list with duplicates removed
        return head;
    }
}