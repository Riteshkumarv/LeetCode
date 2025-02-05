class Solution {
    public int maxProduct(int[] nums) {

        int largest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE;

        for(int num : nums){
            if(num > largest){
                secondLargest = largest; // update the second largest 
                largest = num; // update the largest
            }else if(num > secondLargest) secondLargest = num; // update second largest if greater
        }
        return (largest-1) * (secondLargest-1);
    }
}