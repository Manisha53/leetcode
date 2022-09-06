/*Runtime: 2 ms, faster than 77.66% of Java online submissions for Reverse Integer.
Memory Usage: 41 MB, less than 79.26% of Java online submissions for Reverse Integer.
*/
/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2 power 31, 2 power 31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-2 power 31 <= x <= 2 power 31 - 1

*/


class Solution {
    public int reverse(int x) {
        boolean isnegative=false;
        
        int a=x,res=0;
        if(x<0){
          a=a-2*a; 
          isnegative=true;
        } 
        
        while(a != 0){
            if(res < Integer.MIN_VALUE/10  || res > Integer.MAX_VALUE/10 ) return 0;
            res=res*10+a%10;
            a=a/10;
        }
        
        if(isnegative==true) return -res;
        return res;
    }
}
