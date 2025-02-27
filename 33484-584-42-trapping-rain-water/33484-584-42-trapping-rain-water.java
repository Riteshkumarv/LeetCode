class Solution {
    public int trap(int[] height) {

        int leftMax = 0; // Maximum height encountered from the left
        int rightMax = 0; // Maximum height encountered from the right
        int total = 0; // Total trapped water 
        int left = 0; // left pointer
        int right = height.length-1; // Right pointer

        while(left < right){ // Continue untill pointer meet

            if(height[left] < height[right]){ // Process the smaller height first

                if(height[left] >= leftMax){
                    leftMax = height[left]; // Update left max if current height is greater
                }else{
                    total += leftMax - height[left]; // Water trapped at this index
                }

                left++; // Move left pointer forward
                
            }else{ // Process right side if height[right] is smaller or equal

                if(height[right] >= rightMax){
                    rightMax = height[right]; // Update right max if current height is greater 
                }else{
                    total += rightMax - height[right]; // Water trapped at this index
                }

                right--; // Move right pointer backward

            }

        }

        return total; // Return total trapped water

    }
}

/* class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int sum = 0;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];


        for(int i=1; i<n; i++){

            leftMax[i] = Math.max(leftMax[i-1] , height[i]);

        }

        for(int i=n-2; i>=0; i--){

            rightMax[i] = Math.max(rightMax[i+1] , height[i]);

        }

        for(int i=0; i<n; i++){

            int min = Math.min(leftMax[i] , rightMax[i]);

            sum += min - height[i];

        }

        return sum;

    }
} */