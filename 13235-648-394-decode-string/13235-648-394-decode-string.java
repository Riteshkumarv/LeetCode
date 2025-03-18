class Solution {
    public String decodeString(String s) {
        
        Stack<Integer>numStack = new Stack<>(); // Stack to store the repeat counts (k values)
        Stack<String>strStack = new Stack<>(); // Stack to store the strings and intermediate results
        int k = 0; // To store the current number being formed

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            // If the character is a digit, build the number (in case of multiple digits like 23)
            if(Character.isDigit(ch)){
                k = (k * 10) + (ch - '0');
                continue;
            }

            // If the character is '[', push the current number and reset it 
            if(ch == '['){
                numStack.push(k); // Push the repeat count to the stack
                k = 0; // Reset k for the next number
                strStack.push(String.valueOf(ch)); // Push the '[' onto the stack
                continue;
            }

            // It the character is not ']', push it onto the string stack (part of the substring)
            if(ch != ']'){
                strStack.push(String.valueOf(ch));
                continue;
            }

            // It the character is ']', we need to build the substring
            StringBuilder temp = new StringBuilder();
            // Pop characters until we find '['
            while(!strStack.peek().equals("[")){
                temp.insert(0,strStack.pop());
            } 

            strStack.pop(); // Remove the '[' from the stack

            // Repeat the substring based on the count from numStack
            StringBuilder replacement = new StringBuilder();
            int count = numStack.pop(); // Get the repeat count
            for(int j=0; j<count; j++){
                replacement.append(temp);
            }
            // Push th expended substring back to the stack
            strStack.push(replacement.toString());
        }

        // Build the final result from the stack
        StringBuilder result = new StringBuilder();
        while(!strStack.isEmpty()){
            result.insert(0,strStack.pop());
        }

        return result.toString();
    }
}