class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // Start from the top-right corner of the matrix
        int row = 0;
        int col = matrix[0].length-1;

        // Traverse the matrix within its bounds 
        while(row < matrix.length && col >= 0){

            // If the target is found, return true
            if(matrix[row][col] == target) return true;

            // If the current element is greater than tha target, move left
            if(matrix[row][col] > target){
                col--;
            }

            // If the current element is greater than the target, move left
            else if(target > matrix[row][col]){
                row++;
            }
        }

        // If the loop completers, the target was not found
        return false;
    }
}