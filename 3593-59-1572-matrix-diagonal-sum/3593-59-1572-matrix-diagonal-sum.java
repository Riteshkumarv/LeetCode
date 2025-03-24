class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length; // Get the size of the square matrix
        int sum = 0; // Initialize sum variable

        // Iterate through the matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                // Check if the element is on the primary diagonal (i == j)
                // or the secondary diagonal (i + j == n - 1)
                if(i == j || i+j == n-1){
                    sum += mat[i][j]; // Add the diagonal element to sum
                }
            }
        }
        return sum; // Return the total sum of diagoanl elements
    }
}