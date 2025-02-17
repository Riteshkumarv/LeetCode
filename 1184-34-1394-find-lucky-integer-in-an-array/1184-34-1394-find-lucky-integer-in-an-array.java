class Solution {
    public int findLucky(int[] arr) {

        int n = arr.length;
        
        // Create a frequence array to store occurrences of numbers (1 to 500)
        int []freqArr = new int[501];

        // count frequency of each element in the array
        for(int i = 0; i<n; i++){
            freqArr[arr[i]]++;
        }

        // Traverse from 50 down to 1 to find the largest lucky integer
        for(int i = 500; i>=0; i--){
            // A number is "lucky" if its value is equal to its frequency
            if(freqArr[i] == i && i != 0) return i;
        }
        // If no lucky number is found, return -1
        return -1;
    }
}