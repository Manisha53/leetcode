/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000

*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int f1=0;
        int f2=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        ArrayList<Integer> res=new ArrayList<Integer>();
      
        if(nums1.length==1){
            for(int i:nums2){
                if(nums1[0]==i){
                    res.add(nums1[0]);
                    break;
                }
            }
        }
        else if(nums2.length==1){
            for(int i:nums1){
                if(nums2[0]==i){
                    res.add(nums2[0]);
                    break;
                }
            }
        }
        else{
            for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                
                if(nums1[i]== -1 || nums2[j]== -1){
                    continue;
                }
                
                if(nums1[i]==nums2[j]){ 
                  res.add(nums1[i]);  
                    nums1[i]=-1;
                    nums2[j]=-1;
                    break;
                }
                
             }
          }
        } 
        int[] o=new int[res.size()];
        for(int i=0;i<res.size();i++){
            o[i]=res.get(i);
        }
        return o;
    }
}
/*
Success
Details 
Runtime: 6 ms, faster than 33.22% of Java online submissions for Intersection of Two Arrays II.
Memory Usage: 42 MB, less than 98.75% of Java online submissions for Intersection of Two Arrays II.

*/
