class Solution {
    public int maximumCount(int[] nums) {
 
        // Find the maximum count of either negative or positive numbers
        return Math.max(findLastNeg(nums) , findFirstPos(nums));

    }

    public int findLastNeg(int[] nums){

        int left = 0;
        int right = nums.length-1;
        int ans = -1;

        // Perform binary search to find the last negative number
        while(left <= right){

            int mid = left + (right - left) / 2;

            if(nums[mid] < 0){

                ans = mid; // Store the last found negative index
                left = mid + 1; // Move right to find the last occurrence

            }
            else{
                   
                right = mid - 1; // Move left to find negative numbers

            }    

        }
        
        // The number of negative elements is (index + 1)
        return ans + 1;

    }

    public int findFirstPos(int[] nums){

        int left = 0;
        int right = nums.length-1;
        int ans = -1;

        // Perform binary search to find the first positive number
        while(left <= right){

            int mid = left + (right - left) / 2;

            if(nums[mid] > 0){

                ans = mid; // Store the first found positive index
                right = mid - 1; // Move left to find the first occurrence
                
            }
            else{
                   
                left = mid + 1; // Move right to find positive numbers

            }    

        }

        // If no positive number is found, return 0; otherwise, count from the found index to the end
        return ans == -1 ? 0 : nums.length - ans;

    }

}