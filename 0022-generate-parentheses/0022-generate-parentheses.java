class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans = new ArrayList<>();
        result(n,ans,0,0,"");
        return ans;
    }

    public void result ( int n , List<String> ans, int open , int close, String curr){
        
       if(curr.length()==2*n){
        ans.add(curr);
        return ;
       }

       if(open<n){
         result(n,ans,open+1,close,curr +"(" ) ;
       }

       if(close<open){
         result(n,ans,open,close+1,curr +")" ) ;
       }        

    }

}