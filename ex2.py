# Exercise 2: Dictionary Merging with Logic

# Given Input: dict_a = {'a': 10, 'b': 20} dict_b = {'b': 5, 'c': 15}

# Expected Output: Merged Dictionary: {'a': 10, 'b': 25, 'c': 15}
dict_a = {'a': 10, 'b': 20} 
dict_b = {'b': 5, 'c': 15}

def merge_dict(d1,d2):
    merged = d1.copy()
    for key, value in d2.items():
        merged[key] = merged.get(key,0)+value # .get(key,0) returns 0 if the key doesn't exist.
    return merged

print(f"Merged dictionary: {merge_dict(dict_a,dict_b)}")