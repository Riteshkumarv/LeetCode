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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node to simplify edge cases
        ListNode head = new ListNode(0);
        ListNode list = head;

        // Iterater through both lists until one of them is exhausted 
        while(list1 != null && list2 != null){

            // Compare values and attach the smaller node of them is exhausted 
            if(list1.val > list2.val){
                list.next = list2; // Attach list2 node
                list2 = list2.next; // Move list2 pointer ahead
            }else{
                list.next = list1; // Attach list1 node 
                list1 = list1.next; // Move list1 pointer ahead
            }
            list = list.next; // Move merged list pointer ahead
        }

        // If any elements remain in list1, attach them
        if(list1 != null){
            list.next = list1;
        }

        // If any elements remain in list2, attach them
        if(list2 != null){
            list.next = list2;
        }

        // Return the merged list, skipping the dummy head
        return head.next;
    }
}


