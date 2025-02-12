class Solution {
    public int bulbSwitch(int n) {
        
        int count = 0; // Variable to count the number of bulbs that remain on 
        int i = 1; // Start with the first bulb

        // Itersate while i^2 is within the given range n 
        while(i*i <= n){
            count++; // Increment count for each perfect square
            i++; // Move to the next Integer
        }
        return count; // Return the total count of perfect squares within the range 
    }
}