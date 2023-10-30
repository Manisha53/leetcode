m=int(input())
setm=set(map(int, input().split()))
n=int(input())
setn=set(map(int, input().split()))

setres=(sorted((setm.union(setn)).difference(setm.intersection(setn))))

for i in setres:
    print(i)

