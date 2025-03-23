class Solution {
    public boolean isAnagram(String s, String t) {

        // If the lengths are different, they can't be anagrams
        if(s.length() != t.length()) return false;

        // Create an array to store the frequency of each letter (26 for lowercase letters)
        int freq[] = new int[26];

        // Loop through each character is both strings
        for(int i = 0; i < s.length(); i++){

            char ch1 = s.charAt(i); // Get character from string 's'
            char ch2 = t.charAt(i); // Get character from string 't'

            // Increases frequency for character in 's'
            freq[ch1 - 'a']++; 
            // Decreases frequency for character in 't'
            freq[ch2 - 'a']--;
        }
        // If all elements in the array are zero, the strings are anagrams
        for(int i : freq){
            if(i != 0) return false; // If any value is not zero, they area't anagrams
        }

        return true; // If all values are zero, the strings are anagrams

    }
}