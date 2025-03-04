class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // Min-Heap to store the k largest elements
        PriorityQueue<Integer> pq = new PriorityQueue <>();

        for(int i = 0; i<nums.length; i++){

            // If the heap size is less then k, add the element
            if(pq.size() < k){

                pq.add(nums[i]);
            // If the current element is larger than the smallest in heap, replace it.
            }else if(pq.peek() < nums[i]){
                
                pq.remove(); // Remove the smallest element
                pq.add(nums[i]); // Add the new element

            }

        }
        // The top of the heap contains the k-th largest element
        return pq.peek();        

    }
}