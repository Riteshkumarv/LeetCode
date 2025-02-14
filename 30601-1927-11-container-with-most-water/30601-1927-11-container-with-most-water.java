class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length; // Get the length of the array 
        int maxArea = 0; // Variable to store the maximum area 
        int low = 0; // Left pointer
        int high = n-1; // Right pointer

        // Use the two-pointer approach to find the maximum water area
        while(low < high){

            int width = high - low; // Calculate the width between two lines

            // Calculate the current area using the minimum height between the two pointers
            int currentArea = Math.min(height[low] , height[high]) * width ; 
            
            // Update maxArea if the current area is greater
            maxArea = Math.max(currentArea,maxArea);

            // Move the pointer with the smaller height to find a potentially larger area 
            if(height[low] < height[high]){
                low++; // Move the left pointer forword
            }else{
                high--; // Move the right pointer backward
            }
        }
        return maxArea; // Return the maximum area found
    }
}