"""Sum of Values
Problem Description:

Given a dictionary, find the sum of values of every key in the dictionary.

Input Format:

The input contains two lines.
The first line has space-separated string values which are the keys of the dictionary.
The second line has space-separated integer numbers which are the values of the dictionary.
Output Format:

Print the sum of the values of the items as an integer.
Sample Input:

x y z
25 25 50
Sample Output:

100
Output Explanation:

The dictionary has three key-value pairs having values 25, 25, and 50. Hence their sum, 25+25+50 = 100 should be printed."""


def returnSum(dict1):
    add=sum(dict1.values())
    print(add)
    return(add)
