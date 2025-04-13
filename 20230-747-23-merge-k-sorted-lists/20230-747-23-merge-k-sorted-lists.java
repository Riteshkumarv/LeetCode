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
    public ListNode mergeKLists(ListNode[] lists) {
        
        // If the input list is empty, return null
        if(lists.length == 0){
            return null;
        }

        // Create a min-heap (priority queue) to store the nodes
        // It will always give the node with the smallest value
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a , b) -> a.val - b.val);

        // Add the head node of each list to the priority queue
        for(ListNode node : lists){
            if(node != null){
                pq.offer(node);
            }
        }

        // Create a dummy node to help build the result list easily
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // While there are nodes in the priority queue
        while(!pq.isEmpty()){
            // Get the node with the smallest value
            ListNode minNode = pq.remove();

            // Add it to the result list
            current.next = minNode;
            current = current.next;

            // If the selected node has a next node, add it to the queue
            if(minNode.next != null){
                pq.offer(minNode.next);
            }
        }

        // Return the merged list, which
        return dummy.next;
    }
}

/* 

class Solution {
    
    public ListNode mergeTwoSortedLL(ListNode node1 , ListNode node2){

        ListNode n1 = node1;
        ListNode n2 = node2;
        ListNode ans = new ListNode(0);
        ListNode node = ans;

        while(n1 != null && n2 != null){
            
            if(n1.val > n2.val){
                node.next = n2;
                n2 = n2.next;
            }else{
                node.next = n1;
                n1 = n1.next;
            }
            node = node.next;
        }
        if(n1 != null){
            node.next = n1;
        }
        if(n2 != null){
            node.next = n2;
        }
        return ans.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0){
            return null;
        }

        ListNode ans = lists[0];
        
        for(int i = 1; i < lists.length; i++){
            ans = mergeTwoSortedLL(ans , lists[i]);
        }

        return ans;
    }
}

 */