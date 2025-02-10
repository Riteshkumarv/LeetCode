class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        int left = 0; // Left pointer starts from the beginning
        int right = numbers.length-1; // Right pointer starts from the end

        while(left < right){ // Continue until the pointers meet

            int sum = numbers[left] + numbers[right]; // Compute the sum of elements at left and right pointers

            if(sum > target){
                right--; // If sum is too large, move the right pointer to the left
            }else if(sum < target){
                left++; // If sum is too small, move the left pointer to the right
            }else{
                return new int[]{left+1,right+1}; // Found the currect pair (1-based index)
            }

        }

        return new int[]{-1,-1}; // this case is unreachable since the problem guarantees exactly one solution

    }
}