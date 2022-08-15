class Solution {
    public boolean isPalindrome(String s) {
        boolean flag=false;
        if(s=="") flag= true;
        else{
            s=s.toLowerCase();
            String ispal="";
            
            for(int i=0;i<s.length();i++){
                if(Character.isLetterOrDigit(s.charAt(i)))
                ispal+=s.charAt(i);
            }
            StringBuilder revIspal=new StringBuilder(ispal);
            
            if(ispal.equals(revIspal.reverse().toString())) flag=true;
        }
        return flag;
    }
}
