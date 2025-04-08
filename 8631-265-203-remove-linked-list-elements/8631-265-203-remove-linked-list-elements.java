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
    public ListNode removeElements(ListNode head, int val) {

        // Remove all nodes from the beginning that have the value 'val'
        while(head != null && head.val == val){
            head = head.next; // Move head to the next node
        }
        
        // Initialize a pointer to traverse the rest of the list
        ListNode node = head;

        // Traverse the list and remove nodes with value 'val'
        while(node != null && node.next != null){

            // If the next node has the target value, skip it 
            if(node.next.val == val){
                node.next = node.next.next; // Remove the node
            }else{
                node = node.next; // Move to the next node
            }
        }

        // Return the updated head of the list
        return head; 
    }
}