class Solution {
    public int findPeakElement(int[] nums) {

        int n = nums.length;
        int left = 0;
        int right = n-1;

        // If there is only one element, return its index (0)
        if(n == 1){
            return 0;
        }

        // Binary search to find a peak element
        while(left < right){
 
            int mid = left + (right - left) / 2; // Avoids overflow

            // If mid element is smaller than the next one, move right
            if(nums[mid] < nums[mid+1]){
                left = mid + 1;
            }else{
                // Otherwise, move left (mid could be a peek)
                right = mid;
            }
        }
        // Left will point to a peek element
        return left;
    }
}