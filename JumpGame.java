//Jump Game

class Solution {
    public boolean canJump(int[] nums) {
        int jump = nums.length - 1;
        for(int i = nums.length-2;i>=0;i--){
            if(jump <= i+nums[i]){
                jump = i;
            }
        }

        if(jump==0){
            return(true);
        }
        return(false);
    }
}
