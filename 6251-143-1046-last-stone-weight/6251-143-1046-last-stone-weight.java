class Solution {
    public int lastStoneWeight(int[] stones) {
        
        // Max Heap (Priority Queue) to always get the largest stones first
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones to the priority queue 
        for(int stone : stones){
            pq.offer(stone);
        }

        // Process until we have one or zero stones left 
        while(pq.size() > 1){
                // Get the two heaviest stones
                int first = pq.poll(); // Heaviest stone
                int second = pq.poll(); // Second heaviest stone
            
                // If they are not the same, push the difference back into the heap 
                if(first != second){
                    pq.offer(first - second);
                }
            }
        // If there is one stone left, return its weight, otherwise return 0    
        return pq.isEmpty() ? 0 : pq.poll();
    }
}