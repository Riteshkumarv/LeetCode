class Solution {
    public int compress(char[] chars) {
 
        // StringBuilder to store the compressed string
        StringBuilder sb = new StringBuilder("");

        // Append the first character to the StringBuilder
        sb.append(chars[0]);

        // Initialize count for the first character
        int count = 1;

        // Start from the second character
        for(int i=1; i<chars.length; i++){

            if(chars[i-1] == chars[i]){
                // If current character is same as previous one, increase count
                count++;
            }else{
                // If current character is different from previous one
                if(count > 1){
                    // Append the count to the result if greater then 1
                    sb.append(String.valueOf(count));
                }
                // Reset count for the new character
                count = 1;
                // Append the new character to the result
                sb.append(chars[i]);
            }

        }
        // After the loop, add the count of the last group if greater than 1
        if(count > 1) sb.append(String.valueOf(count));

        // Write the compressed result back to the original array
        for(int i = 0; i < sb.length(); i++){

            chars[i] = sb.charAt(i);

        }
        // Return the length of the compressed string
        return sb.length();
    }
}