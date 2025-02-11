class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int product = 1;
        
        // Array to store the right-side product for each index
        int right[] = new int[n];
        // Array ti store the final answer
        int ans[] = new int[n];

        // Compute the suffix product (product of all elements to the right of the current index) 
        for(int i=n-1;i>=0;i--){
            product *= nums[i];
            right[i] = product;
        }
        
        product = 1; // Reset product to calculate left-side

        // Compuate the result using left-side product and right-side product
        for(int i=0;i<n-1;i++){
            
            ans[i] = product * right[i+1]; // Multiply left product with right product
            product *= nums[i]; // Update left product

        }  
        // The last element only has left product
            ans[n-1] = product; 
            
        return ans;
    }
}