/*
Runtime: 1 ms, faster than 67.20% of Java online submissions for Shuffle the Array.
Memory Usage: 45.7 MB, less than 44.86% of Java online submissions for Shuffle the Array.
*/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[2*n];
        int prev=0,next=n;
        for(int i=0;i<res.length;i+=2){
            res[i]=nums[prev++];
        }
        for(int i=1;i<=res.length;i+=2){
            res[i]=nums[next++];
        }
        return res;
    }
}
