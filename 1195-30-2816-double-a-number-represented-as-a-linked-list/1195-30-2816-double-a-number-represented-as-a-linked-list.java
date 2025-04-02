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
    public ListNode doubleIt(ListNode head) {
        // Step 1: Reverse the linked list
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // Step 2: Double each digit and handle carry
        ListNode newHead = prev; // This is now the reversed list
        int carry = 0;
        ListNode temp = null;
        
        while (prev != null) {
            int newValue = prev.val * 2 + carry;
            prev.val = newValue % 10;
            carry = newValue / 10;
            temp = prev;
            prev = prev.next;
        }
        
        // Step 3: If carry remains, add a new node
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }
        
        // Step 4: Reverse the list back to original order
        prev = null;
        curr = newHead;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}

/* class Solution {
    public ListNode doubleIt(ListNode head) {
        
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        while(head != null){
            sb.append(String.valueOf(head.val));
            head = head.next;
        }

        ListNode ans = new ListNode(0);
        ListNode node = ans;
        int carry = 0;

        for(int i=sb.length()-1; i>=0; i--){

            int num = sb.charAt(i) - '0';

            num = (num * 2) + carry;

            carry = num / 10;
            
            st.push(num % 10);
        }

        if(carry > 0) st.push(carry);

        while(!st.isEmpty()){           
            node.next = new ListNode(st.pop());
            node = node.next;
        }

        return ans.next;
    }
} */