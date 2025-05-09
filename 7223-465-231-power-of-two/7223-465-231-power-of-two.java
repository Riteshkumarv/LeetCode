class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n <= 0) return false; // Handle non-positive numbers 
        
        while(n % 2 == 0){ // Keep dividing by 2 while the number is even
            n = n/2;
        }
         
        return n==1; // If n is 1 , it's a power two

    }
}