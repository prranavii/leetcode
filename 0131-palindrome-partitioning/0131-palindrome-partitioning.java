class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(0,s,new ArrayList<>());
        return result;
    }
    private void backtrack(int start, String s, List<String> ans){
        if(start==s.length()){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int i=start; i<s.length(); i++){
            if(isPalindrome(s,start,i)){
                ans.add(s.substring(start,i+1));
                backtrack(i+1,s,ans);
                ans.remove(ans.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int l , int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
