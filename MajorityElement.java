/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
*/
//----------------------using array-------efficient solution-------------------
class Solution {
    public int majorityElement(int[] nums) {
        int c=1,res=0;
        if(nums.length==1){
            return nums[0];
        }
        else if(nums.length==2){
            if(nums[0]==nums[1]) return nums[0];
        }
        else{
        int count=nums.length/2;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) c++;
            
            
            if(c>count) {
                res=nums[i];
                break;
            }
        } 
        }
       
        return res;
    }
}
//------------using hashmap-------------comparatively less efficient--------------------
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int majority=-1;
        
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null) map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i])+1);
        }
        
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>nums.length/2){
                 majority=entry.getKey();
                 break;
            }
        }
        return majority;
    }
}
