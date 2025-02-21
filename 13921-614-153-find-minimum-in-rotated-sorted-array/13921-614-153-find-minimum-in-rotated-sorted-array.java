class Solution {
    public int findMin(int[] nums) {
        
        int n = nums.length;

        // If the array has only one element, return it directly
        if(n == 1){ 
            return nums[0]; 
        }
        
        // If the array is already sorted (not rotated), return the first element
        if(nums[0] < nums[n-1]){ 
            return nums[0];
        }

        int left = 0;
        int right = n - 1;

        // Perform binary search to find the minimum element
        while(left < right){

            int mid = left + (right - left) / 2; // Calculate mid to prevent overflow

            // If mid is the pivot point where rotation happened, return it
            if(mid != 0 && nums[mid - 1] > nums[mid]){
                return nums[mid];
            }

            // If the element at mid is greater than the next one, return the next one
            if(mid != n-1 && nums[mid] > nums[mid + 1]){
                return nums[mid+1];
            }
            
            // If the left portion is sorted, move to the right half
            if(nums[left] <= nums[mid]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // The left pointer will point to the minimum element
        return nums[left];
    }
}


/*
 class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}
*/