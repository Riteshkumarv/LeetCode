class Solution {
    public int[] plusOne(int[] digits) {

    int n = digits.length; // Define the length of the array

    // If the last digit is not 9, simple increment and return
    if(digits[n - 1] != 9){
        digits[n - 1]++;
        return digits;
    }

    // If the last digit is 9 , set it to 0
    digits[n - 1] = 0;

    // Iterate from second-last digit to the first
    for(int i = n-2; i >= 0; i--){

        if(digits[i] != 9){
            digits[i]++; // Increment the first non-9 digit
            return digits;
        }

        digits[i] = 0; // Set 9s to 0

    }
    
    // If all digits were 9, we need an extra digit at the beginning
    int []ans = new int[n + 1];
    ans[0] = 1;
    return ans; // First digit should be 1, rest are 0 by default
    }

}