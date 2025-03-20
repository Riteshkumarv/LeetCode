class Solution {
    public int maxPower(String s) {

        int max = 1; // To store the maximum power of a substring of the same character
        int count = 1; // To count the length of the current substring of the same character
        
        char ch1 = s.charAt(0); // Start with the first character

        for(int i = 1; i < s.length(); i++){ // Loop through the string from the second character

            char ch2 = s.charAt(i); // Get the current character

            if(ch1 == ch2){ // If the current character is same as the previous one 

                count++; // Increase the count 

            }else{

                ch1 = ch2; // Update the character to the current one 
                count = 1; // REset the count for the new character

            }
            max = Math.max(max , count); // Update max if the current count is greater
        }
        return max; // Return the maximum power
    }
}