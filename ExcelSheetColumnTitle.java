//Accepted 0 ms 41.9 MB java

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s=new StringBuilder();
        while(columnNumber-->0){
            s.append((char)('A'+ columnNumber%26));
            columnNumber=columnNumber/26;
        }
        s.reverse();
        return s.toString();
    }
}
