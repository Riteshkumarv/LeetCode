class Solution {
    public int[] sortedSquares(int[] nums) {
         
        int n = nums.length; // Get the length of the array 

        int left = 0; // Pointer starting from the beginning of the array
        int right = n-1; // Pointer starting from the end of the array

        int arr[] = new int[n]; // Array to store the squared values in sorted order
         
        int index = n-1; // Index to fill the array from the last position
        
        // Iterate until left and right pointers meet 
        while(left <= right){

            int leftProduct = nums[left] * nums[left]; // Square of the left pointer element
            int rightProduct = nums[right] * nums[right]; // Square of the right pointer element
            
            // Compare squares and place the larger one at the current index
            if(leftProduct > rightProduct){
                arr[index--] = leftProduct; // Place left square at the index and move left pointer
                left++;
            }else{
                arr[index--] = rightProduct; // Place right square at the index and move right pointer
                right--;
            }
        }
        return arr; // Return the sorted squared array
    }
}