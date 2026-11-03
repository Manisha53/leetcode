# Exercise 1: List Comprehension Mastery

# Given Input: words = ["apple", "bat", "cherry", "dog", "elderberry"]
# Expected Output: ['APPLE', 'CHERRY', 'ELDERBERRY']

words = ["apple", "bat", "cherry", "dog", "elderberry"]
updated_words=[word.upper() for word in words if len(word)>4]
print(updated_words)