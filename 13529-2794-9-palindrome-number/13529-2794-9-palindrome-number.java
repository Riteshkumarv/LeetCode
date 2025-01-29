class Solution {
    public boolean isPalindrome(int x) {
        // If the number is negative, it's not a palindrome
        if(x < 0)return false; 
        
        // Store the original number to compare later
        int n = x;
         
        // Variable to hold the reversed number 
        int revNo = 0;
        
        
        int d = 0;
         
        // Loop to reverse the digits of the number
        while(n > 0){
            d = n%10; // Extract the last digit of the number
            revNo = revNo*10 + d;
            n = n/10; // Remove the last digit from number
        }
        if(revNo == x) return true; // If the number is equal, it's palindrome

        return false;
    }
}