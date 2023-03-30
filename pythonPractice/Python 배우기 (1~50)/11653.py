a = int(input())
cnt=2
if(a==1):
    print()
else:
    while a!=1:
        if(a%cnt==0):
            print(cnt)
            a=a/cnt
        else:
            cnt += 1
