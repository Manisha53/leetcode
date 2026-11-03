# Exercise 10: Circular Shift (Rotation)

# Practice Problem: Create a function rotate_list(lst, n, direction) that shifts the elements of a list by 
# N positions. The direction can be ‘left’ or ‘right’.

# Exercise Purpose: List rotation is common in cryptography and UI carousels. This exercise teaches you how to
# use slicing and the modulo operator to handle shifts that are larger than the list length.

# Given Input: List: [1, 2, 3, 4, 5], Shift: 2, Direction: 'right'
# Expected Output: [4, 5, 1, 2, 3]

lst=[1, 2, 3, 4, 5]

# right=lst[:len(lst)-2]
# left=lst[len(lst)-2:]
# print(left+ right)

def rotate_list(lst, n, direction):
    if n > len(lst):
        n=n%len(lst)
    if direction == 'right':
        return lst[len(lst)-n:]+lst[:len(lst)-n]
    else:
        return lst[n:]+lst[:n]

print(f"Right Shift 2: {rotate_list(lst, 2, 'right')}")
print(f"Left Shift 1:  {rotate_list(lst, 1, 'left')}")