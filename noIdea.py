n, m = input().split()
arr=list(input().split())
a=set(input().split())
b=set(input().split())
happy=0

for i in arr:
    if i in a:
        happy += 1
    elif i in b:
        happy -= 1

print(happy)
