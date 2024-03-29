/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
*/
//-----------------------------------------------1st approach---------------------------------------
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(target==matrix[i][j]){
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
}
/*Runtime: 1 ms, faster than 38.72% of Java online submissions for Search a 2D Matrix.
Memory Usage: 43.3 MB, less than 11.75% of Java online submissions for Search a 2D Matrix.
Next challenges:*/
//---------------------------------------------2nd approach-------------------------------------
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag=false;
        int row=matrix.length;
        int col=matrix[0].length;
        int r=0,c=col-1;
        
        while(r < row && c >= 0){
            if(matrix[r][c] == target){
                flag= true;
            }
            if(target > matrix[r][c]) r++;
            else c--;
        }
       return flag; 
    }
}
/*
More optimised solution: Runtime: 0 ms, faster than 100.00% of Java online submissions for Search a 2D Matrix.
Memory Usage: 42.3 MB, less than 77.13% of Java online submissions for Search a 2D Matrix
*/
