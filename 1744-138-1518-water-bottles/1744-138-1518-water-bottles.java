class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
         
        // Total number of bottles we can drink initially  
        int ans = numBottles;
        
        // Loop until we don't have enough empty bottles to exchange for a new one
        while(numExchange <= numBottles){

            //Calculate how many new bottles we can get by exchanging    
            int newBottles = numBottles / numExchange;

            //Calculate the remaining bottles after exchanging
            int remBottles = numBottles % numExchange;

            // Add the newly acquired bottles to the total count 
            ans += newBottles;

            // Update numBottles for the next iteration 
            numBottles = newBottles + remBottles;

        }
         
        // Return the total number of bottles we can drink 
        return ans;

    }
}