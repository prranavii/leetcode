class Solution {
    int [] dr = {-1,1,0,0};
    int [] dc = {0,0,-1,1};
    int rowl;
    int coll;
    public int numIslands(char[][] grid) {
        rowl = grid.length;
        coll = grid[0].length;

        boolean [][] visited = new boolean [rowl][coll];
        int islands=0;
        for(int i=0;i<rowl;i++){
            for(int j=0;j<coll;j++){
                if(!visited[i][j] && grid[i][j]=='1' ){
                    dfs(i,j,visited,grid);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void dfs(int r, int c ,boolean [][] visited , char [][] grid){
        if(r<0 || r>=rowl || c<0 || c>=coll || visited[r][c] || grid[r][c]=='0') return;
        if(!visited[r][c]){
            visited[r][c]=true;
        }

        for(int i=0;i<4;i++){
            dfs(r+dr[i] , c+dc[i] , visited, grid);
        }
    }


}