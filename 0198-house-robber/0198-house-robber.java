class Solution {
    public int rob(int[] nums) {
        Integer [] dp = new Integer[nums.length+1];
       return helper(nums,nums.length-1,dp);
    }

    public int helper(int[] nums,int i, Integer[] dp){
       
        if(i==0) return nums[i];
        if(i<0) return 0;
        if(dp[i]!=null) return dp[i];
        int pick = Integer.MAX_VALUE;
        if(i>=1){
             pick = nums[i]+helper(nums,i-2,dp);
        }
       
        int notpick= 0+ helper(nums,i-1,dp);
        int ans= Math.max(pick,notpick);
        return dp[i] = ans;
    }
}