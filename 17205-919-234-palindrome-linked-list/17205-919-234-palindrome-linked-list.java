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
    public boolean isPalindrome(ListNode head) {
        
        // Stack to store the values of the linked list
        Stack<Integer>st = new Stack<>();
        
        // Pointer to traverse the linked list
        ListNode ptr = head;

        // Push all node values onto the stack
        while(ptr != null){
            st.push(ptr.val);
            ptr = ptr.next;
        }

        // Reset pointer to the head of the list
        ptr = head;

        // Compare values from stack (LIFO) with linked list (FIFO)
        while(ptr != null){

            int val1 = ptr.val; // Current node value
            int val2 = st.pop(); // Top of the stack (last inserted value)

            // if values don't match, it's not a palindrome 
            if(val1 != val2) return false;

            ptr = ptr.next; // Move to the next node
        }
 
        return true; // If all values match, it's a palindrome
    }
}

/* class Solution {
    public boolean isPalindrome(ListNode head) {
        
        StringBuilder sb = new StringBuilder();

        while(head != null){
            sb.append(head.val);
            head = head.next;
        }

        return sb.toString().equals(sb.reverse().toString());
    }
} */