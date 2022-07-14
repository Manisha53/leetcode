/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        boolean flag=false;
        for(int i=0;i<len-1;i++){
            if(nums[i]==nums[i+1]){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
/*
Success
Details 
Runtime: 26 ms, faster than 19.90% of Java online submissions for Contains Duplicate.
Memory Usage: 72.6 MB, less than 9.69% of Java online submissions for Contains Duplicate.

*/
