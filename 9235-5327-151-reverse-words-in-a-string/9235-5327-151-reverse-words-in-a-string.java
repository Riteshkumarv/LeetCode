class Solution {
    public String reverseWords(String s) {

        // Split the input string by one or more spaces
        String[] arr = s.split("\\s+");

        // Create a StringBuilder to build the result
        StringBuilder sb = new StringBuilder();

        // Loop through the words in reverse order
        for (int i = arr.length - 1; i >= 0; i--){
            sb.append(arr[i]).append(" "); // Append the word followed by a space
        }

        // Convert StringBuilder to string and trim traling spaces
        return sb.toString().trim();
    }
}
