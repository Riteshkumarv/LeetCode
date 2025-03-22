class Solution {
    public int minAddToMakeValid(String s) {

        int left = 0 , right = 0; // left keeps track of unmatched '(' and right keeps track of unmatched ')'

        // Loop through each character in the string
        for(char ch : s.toCharArray()){

            if(ch == '('){
                left++; // Increment left for every '('
            }else if(ch == ')'){
                if(left > 0){
                    left--; // If there's an unmatched '(', pair it with the current ')'
                }else{
                    right++; // If no unmateched '(', this ')' is extra and needs to fixed
                }
            }
        }
        // Total number of unmatched '(', and ')' that need to be added to make the string valid
        return left + right;
    }
}

/* class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> st = new Stack<>();
        int count = 0;

        for(char ch : s.toCharArray()){

            if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){

                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }else{
                    count++;
                }

            }
        }
        return st.size() + count;
    }
} */