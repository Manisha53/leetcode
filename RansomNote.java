//*******************sol1****************hashmap**********************
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ransome=new HashMap<>();
        
        for(int i=0;i<magazine.length();i++){
             if(ransome.containsKey(magazine.charAt(i))){
                 ransome.put(magazine.charAt(i), ransome.get(magazine.charAt(i))+1);
             }else{
                 ransome.put(magazine.charAt(i),1);
             }
        }
    
        for(int i=0;i<ransomNote.length();i++){
            if(!ransome.containsKey(ransomNote.charAt(i)) || ransome.get(ransomNote.charAt(i))==0) return false;
            else{
                ransome.put(ransomNote.charAt(i), ransome.get(ransomNote.charAt(i))-1);
            }
        }
        
        return true;
    }
}

/*
Runtime: 42 ms, faster than 16.71% of Java online submissions for Ransom Note.
Memory Usage: 52.1 MB, less than 27.26% of Java online submissions for Ransom Note.
*/
//*****************sol2***************chararray************************
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alpha=new int[26];
        
        for(char i:magazine.toCharArray()) alpha[i-'a']++;
        
        for(char i:ransomNote.toCharArray()) alpha[i-'a']--;
        
        for(int i:alpha){
            if(i < 0) return false;
        }
        return true;
    }
}

/*
Runtime: 5 ms, faster than 74.47% of Java online submissions for Ransom Note.
Memory Usage: 46.8 MB, less than 49.08% of Java online submissions for Ransom Note
*/
