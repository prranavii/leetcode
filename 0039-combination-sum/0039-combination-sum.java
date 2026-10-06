class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        ans(0, candidates, target, new ArrayList<>(), result);
        return result;

    }

    static void ans(int index, int [] candidates, int target, List<Integer>current, List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(index==candidates.length || target<0) return;
        
        current.add(candidates[index]);
        ans(index, candidates, target - candidates[index], current, result);
        current.remove(current.size() - 1);

        ans(index + 1, candidates, target, current, result);
    }
}