class Solution {
    public boolean makeEqual(String[] words) {

        // Create an array to store the frequency of each character (26 lettters in the alphabet)  
        int []freq = new int[26];

        // Count the frequency of each character in all the words
        for(String word : words){
            for(char ch : word.toCharArray()){
                freq[ch - 'a']++; // Increment the count for the coorresponding character
            }
        }

        // Check if the frequency of each character is divisible by the number of words
        // If not, it's impossible to distribute characters equally among the words
        for(int i = 0; i<freq.length; i++){
            if(freq[i] % words.length != 0) return false;
        }

        // If all characters can be evenly distributed, return true 
        return true;

    }
}

/* class Solution {
    public boolean makeEqual(String[] words) {

        HashMap<Character , Integer> hm = new HashMap<>();

        for(int i=0; i<words.length; i++){
            for(int j=0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);
                hm.put(ch , hm.getOrDefault(ch , 0) + 1);
            }
        }

        for(char ch : hm.keySet()){
            if(hm.get(ch) % words.length != 0) return false;
        }

        return true;

    }
} */