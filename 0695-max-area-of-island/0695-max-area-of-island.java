class Solution {
    int [] dr = {-1,1,0,0};
    int [] dc = {0,0,-1,1};
    int rowl;
    int coll;
    public int maxAreaOfIsland(int[][] grid) {
        rowl = grid.length;
        coll = grid[0].length;

        boolean [][] visited = new boolean [rowl][coll];
        int max = 0;
        for(int i=0;i<rowl;i++){
            for(int j=0;j<coll;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    max=Math.max(max, dfs(i,j,visited,grid));
                }
            }
        }
        return max;
    }

    public int dfs(int r,int c , boolean [][] visited , int [][] grid){
        if(r<0 || r>=rowl || c<0 || c>=coll || visited[r][c] || grid[r][c] == 0) return 0 ;
        if(!visited[r][c]) visited[r][c]=true;

        int area = 1;
        for(int i=0;i<4;i++){
            area+=dfs(r+dr[i] , c + dc[i] , visited , grid);
        }
        return area;
    }
}