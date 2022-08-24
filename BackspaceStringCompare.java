/*
Runtime: 2 ms, faster than 68.46% of Java online submissions for Backspace String Compare.
Memory Usage: 41.6 MB, less than 82.43% of Java online submissions for Backspace String Compare.

*/
class Solution {
public boolean backspaceCompare(String s, String t) {
ArrayList s1=new ArrayList<>();
ArrayList t1=new ArrayList<>();

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)!='#') s1.add(s.charAt(i));
        else{
            if(s1.size()!=0) s1.remove(s1.size()-1);
        }
    }
    for(int i=0;i<t.length();i++){
        if(t.charAt(i)!='#') t1.add(t.charAt(i));
        else{
            if(t1.size()!=0) t1.remove(t1.size()-1);
        }
    }
    return s1.equals(t1);
}
}
