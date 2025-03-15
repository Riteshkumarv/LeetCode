class Solution {
    public String removeDuplicateLetters(String s) {
  
        int lastIndex[] = new int[26]; // Stores the last index of each character in the string
        boolean present[] = new boolean[26]; // Tracks whether a character is already in the stack
        Stack<Character>stack = new Stack<>(); // Stack to build the result string
 
        // step 1: Strore the last occurrence index of each character
        for(int i=0; i<s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        // step 2: Iterate through the string and process each character
        for(int i=0; i<s.length(); i++){

            int index = s.charAt(i) - 'a';
             
            // If character is already in the result stack, skip it  
            if(present[index]){ 
                continue;
            }else{    
                
                // Remove character from the stack if they are greater than the current character 
                // and they appear later in the string
                while(stack.size() > 0 && stack.peek() > s.charAt(i) && lastIndex[stack.peek() - 'a'] > i){
                    present[stack.peek() - 'a'] = false; // Mark the remove character as not present
                    stack.pop();
                }

                // Add the current character to the stack and mark it as present
                stack.push(s.charAt(i));
                present[index] = true;
            } 

        }
 
        // step 3: Build the final string from the stack 
        StringBuilder sb = new StringBuilder("");

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString(); // Reverse to get the correct order
      
    }
}