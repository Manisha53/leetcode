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
*/USING FOR LOOP - WAY-1 ====07/14/2022 17:35 Accepted 26 ms 72.6 MB java

class Solution {
public boolean containsDuplicate(int[] nums) {
Arrays.sort(nums);
boolean flag=false;
for(int i=0;i<nums.length-1;i++){
if(nums[i]==nums[i+1]) {
flag=true;
break;
}
}
return flag;
}
}
*/USING HASHSET WAY-2 ====08/27/2022 13:17 Accepted 15 ms 70.5 MB java

class Solution {
public boolean containsDuplicate(int[] nums) {
int len=nums.length;
HashSet hs=new HashSet<>();

    for(int i=0;i<len;i++){
        if(!hs.contains(nums[i])) hs.add(nums[i]);
        else return true;
    }
    return false;
}
}

/*java
easy-understanding
for loop array
hashset java
*/
