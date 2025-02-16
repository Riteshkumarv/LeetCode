class Solution {
    public int maxAscendingSum(int[] nums) {
        
        // Initialize sum with the first element of the array
        int sum = nums[0];

        // maxSum keeps track of the maximum ascending subarray sum found
        int maxSum = nums[0];

        // Iterate through the array starting from the second element
        for(int i = 1; i<nums.length; i++){

            // If the current number is greater than the previous one, continue the ascending sequence
            if(nums[i-1] < nums[i]){
                sum += nums[i]; // Add current element (new subarray starts)
            }else{
                sum = nums[i];
            }

            // Update  maxSum with the maxium sum found so far
            maxSum = Math.max(sum , maxSum);

        }

        // REturn the maxumum sum of an ascending subarray
        return maxSum;

    }
}