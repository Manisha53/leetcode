/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 

Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
*/
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map=new HashMap<>();
        String[] words = s.split(" ");
        int l=words.length;
      
        if(l!=pattern.length()){
            return false;
        }
        for(int i=0;i<pattern.length();i++ ){
            char c=pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(words[i])) return false;
            }
            else{
                if(map.containsValue(words[i])) return false;
                map.put(c,words[i]);
            }
        }
        return true;
    }
}

/*
Runtime: 2 ms, faster than 34.70% of Java online submissions for Word Pattern.
Memory Usage: 42 MB, less than 38.17% of Java online submissions for Word Pattern.

*/
