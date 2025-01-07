class Solution {
    public int numEnclaves(int[][] grid) {
       if(grid==null||grid.length==0){
        return 0;
       } 
       int count=0;
       int r=grid.length;
       int c=grid[0].length;
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(i==0||j==0||i==r-1||j==c-1){
                if(grid[i][j]==1){
                
                dfs(grid,i,j);
                }

            }
        }
       }
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(grid[i][j]==1){
                count++;
            }
        }
       }
       return count;
       }
    
    public void dfs(int[][] grid,int i,int j){
        int r=grid.length;
        int c=grid[0].length;
        if(i<0||j<0||i>=r||j>=c||grid[i][j]!=1){
            return;
        }
        grid[i][j]=0;
      
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        
    }
}