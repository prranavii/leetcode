class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Integer [][] dp = new Integer[m+1][n+1];

        return helper(0,0,m,n,grid,dp);
    }

    public int helper(int i, int j , int m , int n , int [][] grid, Integer [][] dp){
        
        if(i==m-1 && j==n-1) return grid[i][j];
        if(i>=m || j>=n) return Integer.MAX_VALUE;

        if(dp[i][j] != null) return dp[i][j];
        int down = helper(i+1 , j , m , n , grid,dp);
        int right = helper(i,j+1,m,n,grid,dp);
        return dp[i][j] =  grid[i][j] + Math.min(down,right);

    }
}