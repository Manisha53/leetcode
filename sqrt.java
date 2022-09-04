//without using math.sqrt method

class Solution {
    public int mySqrt(int x) {
        // return (int)(Math.sqrt(x));
        int res=binarySearch(x);
        return res;
    }
    public int binarySearch(int x){
        int start=1;
        int end=x;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid == x/mid) return mid;
            else{
                if(x/mid < mid) end=mid-1;
                else start=mid+1;
            }
        }
        return end;
    }
}
