class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int answer=nums[0];

        for(int i=1;i<nums.length;i++){
            int x = nums[i];

            int oldmax=max;
            int oldmin=min;

            max = Math.max(x,Math.max(x*oldmax,x*oldmin));
            min = Math.min(x,Math.min(x*oldmax,x*oldmin));

            answer = Math.max(answer,max);
        }
        return answer;
    }
}