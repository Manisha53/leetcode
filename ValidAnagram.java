//**********************sol1*****************08/17/2022 23:14	Accepted	33 ms	46.8 MB	java******************************

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
//************************sol2************08/17/2022 23:27	Accepted	30 ms	46.1 MB	java**************************
class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map=new HashMap<>();
        HashMap<Character, Integer> mapt=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1); //if char already present,++count
            }
            else{
                map.put(s.charAt(i),1); //if not present, count=1
            }
        }
        
        for(int i=0;i<t.length();i++){
            if(mapt.containsKey(t.charAt(i))){
                mapt.put(t.charAt(i),mapt.get(t.charAt(i))+1);
            }else{
                mapt.put(t.charAt(i),1); 
            }
        }
            
        return map.equals(mapt);
    }
}

//************************sol3***********08/17/2022 23:34	Accepted	9 ms	44.2 MB	java**************************

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(t1);
        
        return Arrays.equals(s1,t1);
    }
}
