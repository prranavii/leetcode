// class Solution {
//     int n;
//     public int minimumTotal(List<List<Integer>> triangle) {
//         n= triangle.size();
//         Integer [][] dp = new Integer [n][n];

//         return solveRec(0,0,triangle,dp);
//     }
//     public int solveRec(int i, int j ,List<List<Integer>> triangle , Integer [][] dp){
//         if(i==n-1){
//             return triangle.get(i).get(j);
//         }
//         if(dp[i][j] != null) return dp[i][j];


//         //down
//         int down = triangle.get(i).get(j) + solveRec(i+1,j,triangle,dp);

//         //diagonal
//         int diagonal= triangle.get(i).get(j) + solveRec(i+1,j+1,triangle,dp);
//         return dp[i][j]=Math.min(down,diagonal);
//     }
// }


// class Solution {
    
//     public int minimumTotal(List<List<Integer>> triangle) {
//         int n = triangle.size();
//         int [][] dp = new int [n][n];
//         for(int j=0;j<n;j++){
//             dp[n-1][j]=triangle.get(n-1).get(j);
//         }
//         for(int i= n-2;i>=0;i--){
//             for(int j =i;j>=0;j--){
//                 int down = dp[i+1][j] + triangle.get(i).get(j);
//                 int diagonal=  dp[i+1][j+1] + triangle.get(i).get(j);
//                 dp[i][j]= Math.min(down,diagonal);
//             }
//         }
//         return dp[0][0];
//     }
// }



class Solution {
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int [] prev = new int [n];
        for(int j=0;j<n;j++){
            prev[j]=triangle.get(n-1).get(j);
        }
        for(int i= n-2;i>=0;i--){
            int [] curr= new int [n];
            for(int j =i;j>=0;j--){
                int down = prev[j] + triangle.get(i).get(j);
                int diagonal=  prev[j+1] + triangle.get(i).get(j);
                curr[j]= Math.min(down,diagonal);
            }
            prev=curr;
        }
        return prev[0];
    }
}
