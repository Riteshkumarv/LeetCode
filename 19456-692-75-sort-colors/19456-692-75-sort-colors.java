class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;

        // pointers for the three-way partitioning
        int low = 0; // Pointer for 0s
        int mid = 0; // Pointer for 1s
        int high = n-1; // Pointer for 2s

        // Process elements until mid crosses high
        while(mid <= high){

            if(nums[mid] == 0){
                // Swap current element with the low pointer and move both forward
                swap(nums,low,mid);
                mid++;
                low++;
            }else if(nums[mid] == 1){
                // If it's 1, just move mid forward
                mid++;
            }else{
                // If it's 2, swap with the high pointer and move high backward
                swap(nums,high,mid);
                high--;
            }
        }
    }
    // Helper function to swap element in the array
    public void swap(int nums[], int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}