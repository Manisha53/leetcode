"""
Problem Description:

Write a function to print out the frequency of all the unique elements present in a given tuple.

Input Format:

The one input line consists of a tuple.
Output Format:

Unique elements and their frequencies are expected to be printed as follows:
unique_element1 : freq1
unique_element2 : freq2
.
.
Sample Input:

(10, 8, 5, 2, 10, 15, 10, 8, 5, 8, 8, 2)
Sample Output:

10 : 3
8 : 4
5 : 2
2 : 2
15 : 1
"""

def unique_count(tup):
    freq = {}
    for i in tup:
        if not isinstance(i,list):
            if i not in freq:
                freq[i]=1
            else:
                freq[i]+=1
        else:
            item = tuple(i) #making list into tuple to make it hashable 
            if item in freq:
                freq[item] += 1
            else:
                freq[item] = 1
    for ele, fre in freq.items():
        if isinstance(ele,tuple):
            ele=list(ele)
        print(f"{ele} : {fre}")
