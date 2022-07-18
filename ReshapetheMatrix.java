/*
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

 

Example 1:


Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
Example 2:


Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
 

Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 100
-1000 <= mat[i][j] <= 1000
1 <= r, c <= 300

*/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        int[][] res=new int[r][c];
        int a=0,b=0;
        
        if(r*c==row*col){
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(b==c){                                    //heart of sol starts
                      a++;
                      b=0;
                    } 
                    res[a][b]=mat[i][j];    
                    b++;                                        //heart of sol ends
                }
            }     
        }else{
            return mat;
        }
        return res;
    }
}

/*
Success
Details 
Runtime: 1 ms, faster than 89.33% of Java online submissions for Reshape the Matrix.
Memory Usage: 51.5 MB, less than 6.34% of Java online submissions for Reshape the Matrix.
*/
