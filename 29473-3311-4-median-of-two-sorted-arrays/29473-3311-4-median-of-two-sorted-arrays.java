class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length; // Length of first array 
        int m = nums2.length; // Length of second array
        int nm = n+m; // Total length of marged array
        
        int []nums = new int[nm]; // Array to store merged elements 

        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2
        int index = 0; // Index for merged array
        
        // Merging the two sorted arrays
        while(n > i && m > j){
            if(nums1[i] > nums2[j]){
                nums[index++] = nums2[j++]; // Add smaller element from nums2
            }else{
                nums[index++] = nums1[i++]; // Add smaller element from nums1
            }
        }

        // If elements are left in nums1, add them
        while(n > i){
            nums[index++] = nums1[i++]; 
        }

        // If elements are left in nums2, add them
        while(m > j){
            nums[index++] = nums2[j++]; 
        }
        
        int mid = (n+m)/2;  // Middle index
        int right = n+m-1-mid; // Right middle index from even-length arrays
        
        // If the total length is odd, return the middle element
        if(mid == right) return nums[mid]; 
        else return (nums[mid] + nums[mid-1]) / 2.0; // Return the average of two middle elements
    }
}