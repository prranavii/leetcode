class Solution {
    public int climbStairs(int n) {
        Integer [] dp = new Integer[n+1];

        return helper(n,dp);
    }

    public int helper(int n,Integer[] dp){
        if(n==0 || n==1) return 1;
        if(dp[n] != null) return dp[n];

        int onestep = helper(n-1,dp);
        int twostep = helper(n-2,dp);

        return dp[n] = onestep+twostep;
    }
}