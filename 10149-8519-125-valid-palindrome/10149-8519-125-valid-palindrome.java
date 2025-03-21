class Solution {
    public boolean isPalindrome(String s) {

        int low = 0; // Pointer at the beginning of the string
        int high = s.length()-1; // Pointer at the end of the string

        while(low < high){  
            // Convert character to lowercase to handle case insesitivity 
            char ch1 = Character.toLowerCase(s.charAt(low));
            char ch2 = Character.toLowerCase(s.charAt(high));

            // If character at 'low' is not alphanumeric, skip it 
            if(!(('a' <= ch1 && ch1 <= 'z') || (ch1 >= '0' && ch1 <= '9'))){
                low++;
                continue;
            }

            // If character at 'high' is not alphanumeric, skip it
            if(!(('a' <= ch2 && ch2 <= 'z') || (ch2 >= '0' && ch2 <= '9'))){
                high--;
                continue;
            }
            
            // If characters don't match, it's not a palindrome
            if(ch1 != ch2){
                return false;
                }
            else{
                // Move both pointers inward if characters match
                low++;
                high--;
            }
        }
        // If loop completes without returning false, it's a palindrome
        return true;
    }
}