class Solution {
    public int[] twoSum(int[] nums, int target) {
    
    // Create a hash map to shore the value and its index
    Map<Integer,Integer> map = new HashMap<>();
    
    // Iterate through the array
    for(int i=0; i<nums.length; i++){

        // Calculate the complement        
        int complement = target - nums[i];
        
        // If the complement is already in the map, return the result
        if(map.containsKey(complement)){
            return new int[]{map.get(complement) , i};
        }
        
        // Otherwise, add the current number and its index to the map 
        map.put(nums[i],i);

    }
    
    // If no solution is found
    return new int[]{-1, -1};
               
    }
}