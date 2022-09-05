//09/05/2022 23:32 Accepted 1 ms 42 MB java

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pfx=strs[0];
        
        if(strs==null || strs.length==0) return "";
        
        else if(strs.length == 1) return strs[0];
        
        else{
            for(int i=1;i<strs.length;i++){
                while(!strs[i].startsWith(pfx)) pfx = pfx.substring(0,pfx.length()-1);
            }
                if(pfx.isEmpty()) return "";
        }
       return pfx;
    }
}
// 09/05/2022 23:14 Accepted 2 ms 41.6 MB java

class Solution {
    public String longestCommonPrefix(String[] A) {
         int i,j=0;// J IS FOR LENGTH OF PREFIX
        int l=A.length;
        String str="";
        if(A==null || A.length==0){
            return "";
        }
        if(A.length==1){
            return A[0];
        }
        while(true){
            boolean f=true;
            for(i=1;i<l;i++){
                if(A[i].length()<=j || A[i-1].length()<=j || A[i].charAt(j)!=A[i-1].charAt(j)){
                    f=false;//LENGTH OF STRING AT iTH POSITION SHOULD BE ALWAYS GREATER THAN PREFIXES LENGTH
                    break;
                }
            }
            if(f==true){
                j++;
            }
            else{
                break;
            }
        }
        return A[0].substring(0,j);
    }
}
