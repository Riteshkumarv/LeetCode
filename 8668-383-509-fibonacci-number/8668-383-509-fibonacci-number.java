class Solution {
    public int fib(int n) {
        
        //Base case
        //If n is 0 return 0 (The first fibonacci number is 0).
        if(n == 0){
            return 0;
        }
        
        //If n is 1 return 1 (the second fibonacci number is 1).
        else if(n == 1)return 1;

        //Initialize the first two terms of the fibonacci sequence.
        int firstTerm = 0;
        int secondTerm = 1;
         
        //Loop to calculate the fibonacci number at the nth position.
        for(int i=0; i<n; i++){
            int thirdTerm = firstTerm + secondTerm; // Calculate the next term in the sequence.
            firstTerm = secondTerm; // shift the terms forward.
            secondTerm = thirdTerm; // Update the second term.
        }
        //Return the nth Fibonacci number.
        return firstTerm;
    }
}