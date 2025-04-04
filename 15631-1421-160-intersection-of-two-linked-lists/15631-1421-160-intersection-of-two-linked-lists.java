/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    // Method to calculate the size (length) of linked list
    public int sizeLL(ListNode head){
        
        int count = 0;

        // Traverse the linked list and count the number of nodes
        while(head != null){
            count++;
            head = head.next;
        }

        return count;
    }

    // Method to find the intersection node of two singly linked list
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        // Get the lengths of both linked lists
        int sizeA = sizeLL(nodeA);
        int sizeB = sizeLL(nodeB);

        // Align the starting point of the longer list with the shorter one
        while(sizeA > sizeB){
            nodeA = nodeA.next;
            sizeA--;
        }

        while(sizeB > sizeA){
            nodeB = nodeB.next;
            sizeB--;
        }
        
        // Traverse both lists together until the intersection node is found
        while(nodeB != null && nodeA != null){
            if(nodeB == nodeA) return nodeA; // Intersection found
            nodeB = nodeB.next;
            nodeA = nodeA.next;
        }
        return null; // No intersection found
    }
}