class Solution {
    public int firstUniqChar(String s) {
        int[] temp=new int[26];
        int ascii=0;
        
       for(int i=0;i<s.length();i++){
           ascii=s.charAt(i)-'a';
           temp[ascii]=temp[ascii]+1;
           
       }
       for(int i=0;i<s.length();i++){
            ascii=s.charAt(i)-'a';
           if(temp[ascii]==1) return i;
           
       }
        return -1;
       
    }
}
