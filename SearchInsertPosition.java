class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length - 1]) return nums.length;
        if(target<nums[0])return 0;
           
        int start=0;
        int end=nums.length - 1;
    
        while(start<=end){
            int mid=(start+end)/2;
            
            if(target==nums[mid]) return mid;
            else if(target>nums[mid] && target<nums[mid+1]) return mid+1;
            else if(target<nums[mid] && target>nums[mid-1]) return mid;
            else if(target>nums[mid]) start=mid+1;
            else end=mid-1;
        }
        return 0;
    }
}
/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
Memory Usage: 43.2 MB, less than 69.48% of Java online submissions for Search Insert Position.
*/
