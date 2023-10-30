n = int(input())
s = set(map(int, input().split()))
m = int(input())

for i in range(m):
    a=input().split()
    if a[0] == "pop":
        s.pop()
    elif a[0] == "remove":
        if int(a[1]) in s:
            s.remove(int(a[1]))
    elif a[0] == "discard":
        if int(a[1]) in s:
            s.discard(int(a[1]))

print(sum(s))
