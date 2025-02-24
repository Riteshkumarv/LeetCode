class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length;
        int start = 1;
        int end = n-2;

        // Edge case: If there's only one element, return it
        if(n == 1) return nums[0];

        // Check if the first or last element is the unique one
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1]; 
        
        // Binary search to find the single non-duplicate element
        while(start <= end){

            int mid = start + (end - start) / 2;

            // If mid is the unique element, return it
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            
            // Check which half to search next
            if(mid % 2 == 0){
                // If mid is even and matches the next element, move right
                if(nums[mid] == nums[mid+1]){
                    start = mid + 1;
                }else{
                    // Otherwise, move left
                    end = mid - 1;
                }
            }else{
                // If mid is odd and matches the previous element, move right
                if(nums[mid] == nums[mid-1]){
                    start = mid + 1;
                }else{
                    // Otherwise, move left
                    end = mid - 1;
                }
            }
        }
        return 0; // This line should never be reached
    }
}
