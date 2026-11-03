# Exercise 12: Inverted Index

'''Practice Problem: Create a function that “inverts” a dictionary. 
Convert a dictionary of Author: [List of Books] into a dictionary of Book: Author.
'''

# Given Input:
# {"Orwell": ["1984", "Animal Farm"], "Huxley": ["Brave New World"]}

# Expected Output:
# {'1984': 'Orwell', 'Animal Farm': 'Orwell', 'Brave New World': 'Huxley'}


def invert(input_dict):
    inverted={}
    for author,books in input_dict.items():
        for book in books:
            inverted[book]=author
    return(inverted)

authors = {
    "Orwell": ["1984", "Animal Farm"],
    "Huxley": ["Brave New World"]
}
print(f"Inverted Index: {invert(authors)}")