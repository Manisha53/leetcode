//Runtime: 2 ms, faster than 99.66% of Java online submissions for Largest Local Values in a Matrix.
//Memory Usage: 43.3 MB, less than 94.48% of Java online submissions for Largest Local Values in a Matrix.

class Solution {
    int max=0;int[][] grid;
    public int[][] largestLocal(int[][] grid) {
        this.grid=grid;
        int row=grid.length-2 , col=grid[0].length-2;
        int[][] ans=new int[row][col];
        
            for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[i][j]=findMax(i,j);
            }
          }
        
        return ans;
    }
    
    public int findMax(int a, int b){
        int a3 =a + 3;
        int b3 =b + 3;
        max=0;
        for(int i=a;i<a3;i++){
            for(int j=b;j<b3;j++){
                max=Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
}
