//*************sol1**************** using if-else & stack ********************************
class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack<>();
        if(s.charAt(0)=='}'|| s.charAt(0)==']' || s.charAt(0)==')') return false;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') stack.push(s.charAt(i));
            
            else{
                if(!stack.isEmpty()){
                    if(s.charAt(i)==')' && (char)stack.peek()=='(') stack.pop();
                    else if(s.charAt(i)=='}' && (char)stack.peek()=='{') stack.pop();
                    else if(s.charAt(i)==']' && (char)stack.peek()=='[') stack.pop();
                    else return false;
                 }else return false;   
              }
        }   
        return stack.isEmpty();
    }
}
/*
Runtime: 2 ms, faster than 90.88% of Java online submissions for Valid Parentheses.
Memory Usage: 41.8 MB, less than 70.04% of Java online submissions for Valid Parentheses.
*/

//*********************sol2 *********using switch & stack**************
class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack<>();
        if(s.charAt(0)=='}'|| s.charAt(0)==']' || s.charAt(0)==')') return false;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') stack.push(s.charAt(i));
            
            else{
                if(!stack.isEmpty()){
                    switch(s.charAt(i)){
                        case ')' :
                            if((char)stack.peek()=='(')
                                stack.pop();
                            else return false;
                            break;
                         case '}' :
                            if((char)stack.peek()=='{') 
                                stack.pop();
                            else return false;
                            break;
                        case ']' :
                            if((char)stack.peek()=='[') 
                                stack.pop();
                            else return false;
                            break;
                    }
                 }else return false;   
              }
        }   
        return stack.isEmpty();
    }
}

/*
Runtime: 2 ms, faster than 90.88% of Java online submissions for Valid Parentheses.
Memory Usage: 41.9 MB, less than 70.04% of Java online submissions for Valid Parentheses.
*/
