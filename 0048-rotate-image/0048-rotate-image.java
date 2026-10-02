class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // first take the transpose 
        for(int i=0;i<n;i++){
            for(int j=i+1 ; j<n ;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse the transpose matrix 
        for(int [] row : matrix){
            int left = 0 ;
            int right = n-1;

            while(left<right){
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                left++;
                right--;

            }

        }

    }
}