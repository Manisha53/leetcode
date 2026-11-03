# Exercise 7: Palindrome Sentence
# Given Input: "A man, a plan, a canal: Panama"

# Expected Output: True

input= "A man, a plan, a canal: Panama"
clean_chars = [char.lower() for char in input if char.isalpha()]
print(clean_chars == clean_chars[::-1])
