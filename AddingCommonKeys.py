"""
Adding Common Keys
Problem Description:

Given two dictionaries, write a program for creating a dictionary in such a way that it consists of all the keys that are common in both dictionaries. The values corresponding to the keys in this new dictionary are the sum of the values of those keys in the two dictionaries.

Input Format:

The input contains four lines.
The first line is space-separated string values which are the keys of the first dictionary.
The second line is space-separated integer numbers which are values of the first dictionary.
The third line is space-separated string values which are the keys of the second dictionary.
The second line is space-separated integer numbers which are values of the second dictionary.
Output Format:

Print the resultant dictionary containing added values for common keys.
Sample Input:

a b c
1 2 3
c d e
4 5 6
Sample Output:

{'c': 7}
Output Explanation:

Given the two dictionaries, {'a': 1, 'b': 2, 'c': 3} and {'c': 4, 'd':5. 'e', 6}, key 'c' is common having values 3 and 4. 
Therefore, their sum 7 with the key 'c' should be added in to the resultant dictionary.
"""

def commonKey(dict1, dict2):
  '''dict1, dict2 are the two dictionaries
     print the required dictionary'''
     
  dict3 = {}
  common = common_keys(dict1, dict2)
  
  for i in common:
    add = dict1.get(i)+dict2.get(i)
    dict3.update({i:add})

  print(dict3)
  return(dict3)

def common_keys(dict1, dict2):
    return [key for key in dict1.keys() if key in dict2.keys()]
