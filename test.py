a=[1, 1, 2, 2, 3, 3, 3]
list=[]
arr=set(a)

for i in arr:
    list.append(a.count(i))

print(list.count(max(list)))

if list.count(max(list))>=2:
    answer= -1
else:
    answer= max(list)
print(answer)