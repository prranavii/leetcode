class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxlen = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {

                int current = num;
                int len = 1;

                while (set.contains(current + 1)) {
                    current++;
                    len++;
                }

                maxlen = Math.max(maxlen, len);
            }
        }

        return maxlen;
    }
}