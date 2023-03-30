a,b = map(int,input().split())
c= int(input())
if(b+c>=60):
    d=(b+c)//60
    b=(b+c)%60
    if(a+d>=24):
        a=a+d-24
    else:
        a=a+d
else:
    b=b+c
print(f'{a} {b}')