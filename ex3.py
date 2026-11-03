# Exercise 3: Frequency Map with Counter

# Given Input: text = "Python Programming"

# Expected Output:

# Character Frequency: 
# Counter({'p': 2, 'y': 1, 't': 1, 'h': 1, 'o': 2, 'n': 2, 'r': 2, 'a': 1, 'g': 2, 'm': 2, 'i': 1})
from collections import Counter
text = "Python Programming"

def count_frequency(s):
    clean_text = s.replace(" ","").lower()
    return Counter(clean_text)

print(count_frequency(text))

