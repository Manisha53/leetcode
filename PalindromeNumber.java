/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
*/
class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        StringBuffer t=new StringBuffer(s);
        t=t.reverse();
        String st=t.toString();
       
        boolean flag=false;

        if(s.equals(st)){
            flag=true;
        }
        return flag;
    }
}
