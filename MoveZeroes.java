/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1

*/

//---------------------in-place--------------------
/*
10/30/2022 09:38	Accepted	15 ms	54.3 MB
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroLoc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && nums[zeroLoc]==0){
                int swap=nums[i];
                nums[i]=nums[zeroLoc];
                nums[zeroLoc]=swap;
            }
            if(nums[zeroLoc]!=0) zeroLoc++;
        }
    }
}

//-----------------using extra memory-------------------

/*
10/30/2022 12:35	Accepted	7 ms	54.7 MB
*/
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        int count0=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                res.add(nums[i]);
            }
            else count0++;
        }
        while(count0!=0){
            res.add(0);
            count0--;
        }
        for(int i=0;i<nums.length;i++) nums[i]=res.get(i);
    }
}
