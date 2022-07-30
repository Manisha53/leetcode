/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 

Constraints:

The given address is a valid IPv4 addres

*/
//--------------------------brute force method --------------------------
class Solution {
    public String defangIPaddr(String address) {
        String add="[.]";
        String res="";
        int len=address.length();
        for(int i=0;i<len;i++){
            if(address.charAt(i)=='.'){
                res+=add;
            }
            else{
                res+=address.charAt(i);
            }
        }
        return res;
    }
}
