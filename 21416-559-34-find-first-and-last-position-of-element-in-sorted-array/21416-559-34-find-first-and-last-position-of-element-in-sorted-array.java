class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Find the first occurrence of the target
        int first = findFirst(nums, target);
        // Find the last occurrence of the target
        int last = findLast(nums, target);

        // Return the indices of the first and last occurrence
        return new int[]{first, last};
    }

    // Method to find the first occurrence of the target
    public int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1; // Default value if the target is not found

        while (left <= right) {
            int mid = (left + right) / 2; // Calculate mid index

            if (nums[mid] == target) {
                ans = mid; // Store the index where target is found
                right = mid - 1; // Continue searching in the left half
            } else if (nums[mid] > target) {
                right = mid - 1; // Target lies in the left half
            } else {
                left = mid + 1; // Target lies in the right half
            }
        }
        return ans; // Return the first occurrence index
    }

    // Method to find the last occurrence of the target
    public int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1; // Default value if the target is not found

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid index

            if (nums[mid] == target) {
                ans = mid; // Store the index where target is found
                left = mid + 1; // Continue searching in the right half
            } else if (nums[mid] > target) {
                right = mid - 1; // Target lies in the left half
            } else {
                left = mid + 1; // Target lies in the right half
            }
        }
        return ans; // Return the last occurrence index
    }
}
