class Solution {
    public int tribonacci(int n) {

        if(n == 0) return 0; //base case
        if(n == 1 || n == 2 ) return 1; // base case

        // Initialize the first three terms of the tribonacci squence
        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 1;
         
        // Loop to calculate the Tribonacci numbers from 3 to n 
        for(int i = 0; i < n; i++){ 
            //Calculate the next term in the sequence
            int fouthTerm = firstTerm + secondTerm + thirdTerm;
            // Update the term in the sequence
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = fouthTerm;
        }
        return firstTerm; // Return the nth Tribonacci number
 
    }
}