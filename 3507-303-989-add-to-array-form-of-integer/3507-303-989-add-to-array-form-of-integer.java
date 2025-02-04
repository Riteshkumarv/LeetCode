class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        // List to store the result in array form 
        List<Integer> arr = new ArrayList<>();

        // Pointer to traverse the input array from the last digit
        int p = num.length-1;
       
        // Iterate while there are digits left in num[] or l is non-zero 
        while(p >= 0 || k > 0){

        // If the pointer is valid, add the current digit from num[] to k     
            if(p >= 0){
                k += num[p--]; // Add num[p] to k and move the pointer left
            }

        // Extract the last digit of k and add it to the result list 
            arr.add(k % 10);
        
        // Remove the last digit from k (integer division by 10)
            k /= 10;

        }
        // Since digits are added in reverse order, reverse the list before returning
        Collections.reverse(arr);
        
        return arr;
    }
}