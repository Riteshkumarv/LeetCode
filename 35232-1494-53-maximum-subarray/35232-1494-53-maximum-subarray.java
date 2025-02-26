
// Kadane’s Algorithm 

class Solution {
    public int maxSubArray(int[] nums) {

        // Variable to keep track of the current subarray sum
        int sum = 0;

        // Variable to store the maximum subarray sum found so far
        int max = nums[0];

        // Iterate through each number in the array
        for(int num : nums){

            // Choose the maximum between extending the current subarray or stanting fresh from the current number
            sum = Math.max(sum + num , num);

            // Update the maximum subarray sum if the current sum is greater
            max = Math.max(sum , max);

        }

        // Return the maximum subarray sum
        return max;

    }
}


/* class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int sum = 0;
        int max = nums[0];

        for(int i = 0; i<n; i++){

            if(sum + nums[i] > nums[i]){
                sum += nums[i];
            }else{
                sum = nums[i];
            }

            max = Math.max(sum , max);

        }

        return max;
        
    }
} */