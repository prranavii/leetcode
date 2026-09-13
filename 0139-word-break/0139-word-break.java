class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        Boolean [] dp = new Boolean[s.length()];
        return helper(0,s,set,dp);

    }

    public boolean helper(int i , String s , HashSet<String> set, Boolean [] dp ){
        if(i==s.length()) return true;

        if(dp[i]!=null) return dp[i];

        for(int j=i+1;j<=s.length();j++){
            String word = s.substring(i,j);
            if(set.contains(word)){
                if(helper(j,s,set,dp)){
                    return dp[i]=true;
                }
            }
        }

        return dp[i]=false;

    }
}