class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0; // Pointer to track the position for valid elements
        int right = nums.length; // Pointer to track the effective array size

        while (left < right){ // Iterate until left pointer crosses right
            if(nums[left] == val){ // If the current element is equal to val
                nums[left] = nums[--right]; // replace it with the last valid element and decrease the array size
            }else{
                left++; // Move to the next element if it's not equal to val 
            }
        }
        return right; // The new length of the modified array
    }
}
