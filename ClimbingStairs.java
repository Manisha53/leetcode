// Time limit exceeds for 2 test cases viz. when n=44&45------------recursive solution-----------
class Solution {
public int climbStairs(int n) {
if(n==1) return 1;
else if(n==2) return 2;
else return (climbStairs(n-1)+climbStairs(n-2));
}
}

/*31 / 45 test cases passed.

//***********dp solution****************************
class Solution {
    public int climbStairs(int n) {
            
        int[] dp=new int[n+1];
        dp[0]=1; 
        dp[1]=1; 
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
Memory Usage: 41.5 MB, less than 11.87% of Java online submissions for Climbing Stairs.
*/
