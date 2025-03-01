class Solution {
    public String largestNumber(int[] nums) {

      // Convert integer array to a string array  
      String[] arr = new String[nums.length];

      for(int i=0;i<nums.length;i++){
          arr[i]=String.valueOf(nums[i]); // Convert integer to string
      }

      // Sort the array using a custom comparator
      // Compare two numbers as strings by checking which concatenation forms a larger number
      Arrays.sort(arr,(s1,s2)->(s1+s2).compareTo(s2+s1));

      // Use StringBuilder to construct the result
      StringBuilder sb = new StringBuilder("");

      // Append elements in reverse order to get the largest number
      for(int i=arr.length-1;i>=0;i--){
          sb.append(arr[i]);
      }

      // Handle the case where the result is all zeors (e.g., [0, 0])  
      if(sb.charAt(0)=='0'){
          return "0";
      }else{
          return sb.toString(); // Return the final largest number
      }
    }
}