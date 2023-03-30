count=int(input())
for i in range(count):
    a = list(map(str,input().split()))
    b=float(a[0])
    for j in range(len(a)):
        if(a[j]=='@'):
            b=b*3
        elif(a[j]=='%'):
            b+=5
        elif(a[j]=='#'):
            b-=7
    print("%0.2f"  % b)