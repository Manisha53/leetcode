/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
 

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int max_till_now=nums[0]<0 ? 0 : nums[0];
        
        for(int i=1;i<nums.length;i++){
            max_sum=Math.max(max_sum, max_till_now+nums[i]);
            max_till_now+=nums[i];
            
            if(max_till_now <0) max_till_now=0;
            
        }
        return max_sum;
    }
}
/*
Success
Details 
Runtime: 2 ms, faster than 71.29% of Java online submissions for Maximum Subarray.
Memory Usage: 72.8 MB, less than 79.59% of Java online submissions for Maximum Subarray.
*/
