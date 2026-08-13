class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int len = 1;
        int maxlen =1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){
                len++;
            }else if(nums[i]==nums[i+1]){
                continue;
            }else {
                len=1;
            }
             maxlen = Math.max(len,maxlen);
            
        }
       
        return maxlen;
    }
}