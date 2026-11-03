# Exercise 4: Anagram Checker

# Given Input: word1 = "listen", word2 = "silent"
# Expected Output: Is "listen" an anagram of "silent"? True


def anagram(s,t):
    word1 = sorted(s.lower().replace(" ",""))
    word2 = sorted(t.lower().replace(" ",""))
    return word1==word2

word1 = "listen" 
word2 = "silent"

print(f"Is {word1} an anagram of {word2}? {anagram(word1,word2)}")

