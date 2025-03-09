class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer , Boolean> hm = new HashMap<>();

        // Step 1: Store all numbers in a HashMap and mark them as false (not a sequence start yet)
        for(int num : nums){
            hm.put(num,false);
        }
        
        // Step 2: Mark the numbers that can be start of a sequence
        for(int key : hm.keySet()){
            if(!hm.containsKey(key - 1)){ // If there is no smaller number, this could be sequence start
                hm.put(key,true);  
            }
        }

        int max = 0; // To keep track of the longest sequence langth

        // Step 3: Find the longest consecutive sequence 
        for(int key : hm.keySet()){
            int k = 1;
            if(hm.get(key)){ // If this is a sequence start 
                while(hm.containsKey(key + k)){ // Count the consecutive numbers 
                    k++;
                }
            }
            max = Math.max(max , k); // Update max if a longer sequence is found
        }

        return max;

    }
}