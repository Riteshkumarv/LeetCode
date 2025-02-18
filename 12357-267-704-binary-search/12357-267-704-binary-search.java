class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length; // Get the length of the array

        int left = 0; // Initialize the left pointer
        int right = n-1; // Initialize the right pointer

        while(left <= right){ // Continue the search while left index is less than or equal to right index

            int mid = (left+right) / 2; // Calkkculate the middle index

            if(nums[mid] == target){ // If the middle element is the target, return its index
                return mid;
            }
            else if(nums[mid] > target){ // It the middle element is greater than target, search n the left half
                right = mid - 1;
            }else{ // If the middle element is smaller than target, search in the right half
                left = mid + 1;
            }

        }
        return -1; // If the target is not found, return -1
    }
}