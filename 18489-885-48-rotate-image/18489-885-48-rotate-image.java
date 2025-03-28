class Solution {
    public void rotate(int[][] matrix) {
     
        int n = matrix.length; // Get the size of the matrix (n * n)

        // Step 1: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Step 2: Reverse eacg row to complete the 90-degree rotation
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}