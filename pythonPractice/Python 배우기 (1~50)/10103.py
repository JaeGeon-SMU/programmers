c=s=100
cnt=int(input())
for i in range(cnt):
    a,b = map(int,input().split())
    if(a>b):
        s-=a
    if(a<b):
        c-=b
print(c)
print(s)