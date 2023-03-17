def gcd(num1,num2):
    r=1
    if(num1 ==1 or num2 == 1):
        return 1
    
    if(num1>num2):
        while r!=0:
            r=num1%num2
            num1=num2
            num2=r
        return num1
    else:
        while r!=0:
            r=num2%num1
            num2=num1
            num1=r
        return num2

a=int(input())
for i in range(a):
    b,c=map(int,input().split())
    print(b*c//gcd(b,c))

