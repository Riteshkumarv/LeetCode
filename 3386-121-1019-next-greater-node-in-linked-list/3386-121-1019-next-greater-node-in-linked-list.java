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
    
    // Helper function to calculate hte the size of linked list
    public int sizeLL(ListNode node){

        int count = 0;

        while(node != null){
            count++;
            node = node.next;
        }
        return count;
    }

    // Helper function to reverse the listed list
    public ListNode reverseLL(ListNode head){

        ListNode node = head;
        ListNode prev = null;
        ListNode next = null;

        while(node != null){
             
            next = node.next;  // Save next node
            node.next = prev; // Reverse current node's pointer
            prev = node; // Move prev one step forward
            node = next; // Move to next one
        }
        return prev; // New head of the reversed list
    }

    // main function to find the next greater node for each node in the list
    public int[] nextLargerNodes(ListNode head) {
        
        int size = sizeLL(head); // Get the size of the linked list
        ListNode reverse = reverseLL(head); // Reverse the linked list

        int arr[] = new int[size]; // Array to store results
        Stack<Integer> st = new Stack<>(); // Stack to track next greater elements

        while(reverse != null){            
            // Pop elements thet are smaller or equal to current node's value
            while(!st.isEmpty() && st.peek() <= reverse.val){
                st.pop();
            }

            // If stack it empty, no greater; else, top is the next greater
            arr[--size] = st.isEmpty() ? 0 : st.peek();

            // Push current value to the stack
            st.push(reverse.val);

            // Move to the next node
            reverse = reverse.next;
        }
        return arr;
    }
}