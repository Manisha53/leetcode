// BIT MANIPULATION : XOR : x^0=x and x^x=0 : 09/10/2022 23:35	Accepted	9 ms	50.2 MB	java

class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i : nums){
            result=result^i;
        }
        return result;
    }
}
// HASHMAP : 09/10/2022 23:47	Accepted	26 ms	53.9 MB	java

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) map.put(nums[i],2);
            else map.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1) return entry.getKey();
        }
        return 0;
    }
}
