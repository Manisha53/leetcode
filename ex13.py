# Exercise 13: Dictionary Sorting (Lambda)

"""Practice Problem: Given a list of dictionaries (representing employees), 
sort them based on their “salary” in descending order using a lambda function."""

# Given Input:
# employees = [{"name": "A", "salary": 50}, {"name": "B", "salary": 70}, {"name": "C", "salary": 60}]

# Expected Output:
# [{'name': 'B', 'salary': 70}, {'name': 'C', 'salary': 60}, {'name': 'A', 'salary': 50}]

employees = [
    {"name": "A", "salary": 50}, 
    {"name": "B", "salary": 70}, 
    {"name": "C", "salary": 60}
    ]

sorted_emp=sorted(employees, key=lambda x:x['salary'], reverse=True)  #sorted(list, key=lambda x: x['key_name'], reverse=True)
print(sorted_emp)