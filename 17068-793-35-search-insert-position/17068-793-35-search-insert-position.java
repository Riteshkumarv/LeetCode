class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int n = nums.length;
        int left = 0;
        int right = n-1;

        // Binary search loop
        while(left <= right){
            
            // Calculate mid index (without overflow risk)
            int mid = left + (right - left);

            // If target is found at mid, return mid index
            if(target == nums[mid]){
                return mid;
            }
            // If target is smaller, move tot he left half
            if(target < nums[mid]){
                right = mid-1;

            // If target is larger, move to the right half    
            }else{
                left = mid+1;
            }

        }
        
        // If target is not found, return the insert position
        return left;
    }
}