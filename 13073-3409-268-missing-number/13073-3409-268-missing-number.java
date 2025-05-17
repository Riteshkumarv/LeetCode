class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        // Calculate the expected sum of first 'n' natural numbers using the formula n*(n+1)/2
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of elements present in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // The missing number is the difference between the expected and actual sum
        return expectedSum - actualSum;
    }
}
