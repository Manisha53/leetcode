# Exercise 5: Flatten a Nested List

# Given Input: nested = [1, [2, 3], [4, [5, 6]], 7]
# Expected Output: Flattened: [1, 2, 3, 4, 5, 6, 7]

nested = [1, [2, 3], [4, [5, 6]], 7]

def flat(lst):
    flat_lst=[]
    for i in lst:
        if isinstance(i, list):
            flat_lst.extend(flat(i))
        else:
            flat_lst.append(i) # base condition
    return flat_lst

print(f"Flattend list of {nested} list is: {flat(nested)}")