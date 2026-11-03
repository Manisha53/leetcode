# Exercise 8: List Comprehension Filtering (Advanced)

# Given Input: ["apple", "education", "ice", "ocean", "python", "umbrella"]
# Expected Output: ['education', 'umbrella']

input=["apple", "education", "ice", "ocean", "python", "umbrella"]
filter=[fruit for fruit in input if len(fruit)>5 and fruit[0].lower() in 'aeiou']

print(f"Original: {input}")
print(f"After List Comprehension: {filter}")