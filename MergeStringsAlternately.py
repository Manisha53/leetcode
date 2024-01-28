class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        len1, len2 = len(word1),len(word2)
        res=""
        for i in range(min(len1,len2)):
            res+=word1[i]
            res+=word2[i]

        if len1 > len2 :
            res+=word1[i+1:]
        else:
            res+=word2[i+1:]
        return res
