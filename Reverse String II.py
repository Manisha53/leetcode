'''
Easy

Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"
 

Constraints:

1 <= s.length <= 104
s consists of only lowercase English letters.
1 <= k <= 104
'''

class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        l = 0
        r = k
        n = len(s)
        while l < n:
            sub1 = s[0:l]
            sub2 = s[l:r]
            sub3 = s[r:]
            sub2 = sub2[::-1]
            s = sub1+sub2+sub3
            l = r+k
            r = l+k
        return s
