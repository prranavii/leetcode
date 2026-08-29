class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        backtrack(0,result,current,nums);
        return result;
    }

    public void backtrack (int index , List<List<Integer>> result , ArrayList<Integer> current , int [] nums){

        result.add(new ArrayList<>(current));
        for(int i =index ; i<nums.length ;i++){
            current.add(nums[i]);
            backtrack(i+1 , result , current, nums);
            current.remove(current.size()-1);
            
        }

    }
}