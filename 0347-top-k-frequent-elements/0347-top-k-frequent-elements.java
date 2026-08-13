class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] ans = new int [k];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        
        for(int x=0;x<k;x++){
            int max = 0;
            int maxelement = 0;


            for(Integer key : map.keySet()){
                int freq = map.get(key);
                if(freq>max){
                    max = freq ;
                    maxelement=key;
                }
            }

            ans[x]=maxelement;
            map.remove(maxelement);

        }
        return ans;
    }
}