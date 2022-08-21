/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long start=1;
        long end=n;
        long result=n;
        long mid=(start+end)/2;
        
        if(n==1) return 1;
        
        while(start<=end){
          
            if(isBadVersion((int)mid)){
                end=mid-1;
                result=mid;
            } 
            else start=mid+1;
            
            mid=(start+end)/2;
        }
        return (int)result;
    }
}
/*
24 / 24 test cases passed.
Status: Accepted
Runtime: 24 ms
Memory Usage: 40.7 MB
*/
