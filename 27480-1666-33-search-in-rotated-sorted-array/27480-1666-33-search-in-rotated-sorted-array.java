class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right){

            // Calculate the middle index to avoid integer overflow
            int mid = left+(right-left) / 2;

            // If the target is found at mid, return the index
            if(target == nums[mid]) return mid;

            // Check if the left portion is sorted
            if(nums[left] <= nums[mid]){
                
                // If the target lies within the sorted left portion
                if(target < nums[mid] && target >= nums[left]){
                    right = mid-1; // Search in the left half
                }else{
                    left = mid+1; // Search in the right half
                }

            }else{ // If the right portion is sorted
                 
                 // If the target lies within the sorted right portion 
                if(target > nums[mid] && target <= nums[right]){
                    left = mid+1; // Search in the right half
                }else{
                    right = mid-1; // Search in the left half
                }
            }
        }
        // Target not found, return -1
         return -1;
    }
}