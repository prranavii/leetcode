class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int maxi = 1;
        int [] dp = new int [n];
        for(int i=0;i<n;i++){
            dp[i]=1;

        }
        for(int curr=1;curr<n;curr++){
            for(int prev=0;prev<curr;prev++){
                if(nums[curr]>nums[prev] && dp[curr]<dp[prev]+1){
                    dp[curr] = dp[prev]+1;
                }
                maxi = Math.max(maxi , dp[curr]);
            }
        }
        return maxi;
    }
}