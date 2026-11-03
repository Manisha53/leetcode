# Exercise 9: Remove Duplicates (Preserving Order, so don't use set)

# Given Input: [1, 2, 2, 3, 1, 4, 2]
# Expected Output: [1, 2, 3, 4]

seen=set()
result=[]
input=[1, 2, 2, 3, 1, 4, 2]

for i in input:
    if not i in seen:
        result.append(i)
        seen.add(i)

print(f"Original: {input} and Result: {result}")