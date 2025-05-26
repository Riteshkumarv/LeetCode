class Solution {
    public boolean increasingTriplet(int[] nums) {

        int n=nums.length; // Get the length of the array

        int first = Integer.MAX_VALUE; // Smallest element in the sequence
        int second = Integer.MAX_VALUE; // Smallest element in the sequence

        // Traverse the array
        for(int i = 0; i < n; i++){

            int element = nums[i]; // Current element

            if(first >= element){
                // Update first if current element is smaller or equal
                first = element;
            }else if(second >= element){
                // Update second if current element is greater than first but smaller or equal to second
                second = element;
            }else{
                // If we find an element greater than both first and second, return true
                return true;
            }
        }   
        return false; // No increasing triplet found
    }
}