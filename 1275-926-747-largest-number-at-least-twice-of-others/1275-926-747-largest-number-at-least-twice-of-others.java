class Solution {
    public int dominantIndex(int[] nums) {
        // Initaialize variables to track the largest and second largest elements
        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;
        int index = 0; // Store the index of the largest element

        // Iterate through the array to find the largest and second largest elements
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largestElement){
                // Update secondLargest before updating largest
                secondLargestElement = largestElement;
                largestElement = nums[i];
                index = i; // Update index of the largest element
            }else if(nums[i] > secondLargestElement){
                // Update secondLargest if the current number is smaller than largest but greater than secondLargest
                secondLargestElement = nums[i];
            }
        }
        // Check if the largest element is at least twice as large as the second largest
        if(largestElement >= secondLargestElement*2) return index;
 
        return -1; // Return -1 if no such dominant element exists

    }
}