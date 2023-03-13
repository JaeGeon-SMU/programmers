cnt = int(input())
for i in range(cnt):
    li = list(map(str,input().split()))
    repeat=int(li[0])
    li2 = list(li[1])
    for j in range(len(li2)):
        for k in range(repeat):
            print(li2[j],end='')
    print()