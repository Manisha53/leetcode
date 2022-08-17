//HASHMAP SOLUTION

class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag=true;
        HashMap<Character, Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1); //if char already present,++count
            }
            else{
                map.put(s.charAt(i),1); //if not present, count=1
            }
        }
        
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1); //if match found, --count
            }else{
                return false; //if diff char found, not an anagram
            }
        }
            
        for(int i=0;i<map.size();i++){
            if(map.get(s.charAt(i))!=0) return false;
        }
        return true;
    }
}
