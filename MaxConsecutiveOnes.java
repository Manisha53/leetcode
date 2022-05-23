/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.

*/


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int max=0;
        if(nums.length == 1 && nums[0]==0){
            return 0;
        }
        if((nums.length == 1 && nums[0]==1)||(nums.length==2 && nums[0]==0 && nums[1]==1)){
            return 1;
        }
        
        if(nums.length>1){
             for(int i=0;i<nums.length-1;i++){
               if(nums[i]==1){
                   int j=i+1;
                   res=1;
                   while(j<nums.length){
                       if( nums[j]==1){
                           res++;
                           j++;
                       }
                       else{
                           break;
                       }
                      } 
                   if(max < res){
                   max=res;
                   }
                  }
               
           }
            
        }
      
       return max; 
    }
}
