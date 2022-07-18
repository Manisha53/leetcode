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
