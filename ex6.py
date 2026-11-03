# Exercise 6: Reverse Each Word of a String

# Given Input: "Python is awesome"
# Expected Output: "nohtyP si emosewa"

input = "Python is awesome"
words = input.split(" ")
result=[]

for word in words:
    result.append(word[::-1])

words = " ".join(result)
print(f"Before reversal: {input}")
print(f"Reversed words are : {words}")


