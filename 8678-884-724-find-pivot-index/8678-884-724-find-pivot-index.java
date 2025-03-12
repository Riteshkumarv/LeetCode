class Solution {
    public int pivotIndex(int[] nums) {
        
        int leftSum = 0; // Store the sum of elements to the left of the current index
        int totalSum = 0; // Stores the total sum of the array

        // Calculate the total sum of the array
        for(int num : nums){
            totalSum += num;
        }

        // Iterate through the array to find the pivot index 
        for(int i=0; i<nums.length; i++){
            
            totalSum = totalSum - nums[i]; // Subtract the current element from totalSum to get right sum 

            // If left sum equals right sum, return the current index 
            if(totalSum == leftSum) return i;

            leftSum += nums[i]; // Add the current element to leftSum for next iteration

        }

        return -1; // Return -1 if no pivot index is found

    }
}