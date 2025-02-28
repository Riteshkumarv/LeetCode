class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int index = 0; // To count how many number are smaller than target
        int count = 0; // to count occurrences of the target in the array

        List<Integer> ans = new LinkedList<>(); // Result list to store target indices

        // First pass : Count elements smaller than target and occurrences of target
        for(int i = 0; i<nums.length; i++){

            if(nums[i] < target){
                index++; // Increment index for numbers smaller than target
            }
            else if(nums[i] == target){
                count++; // Increment count for occurrences of target
            }

        }

        // If target is not found in nums, return an empty list
        if(count == 0) return ans;

        // Second pass : Add target indices assuming the array was sorted
        for(int i=index; i<index+count; i++){
            
            ans.add(i); // Indices of target in sorted order

        }

        return ans;
        
    }
}