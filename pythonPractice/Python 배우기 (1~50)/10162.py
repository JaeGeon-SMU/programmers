num=int(input())
A=B=C=0
if(num%10!=0):
    print(-1)
else:
    A=num//300
    num=num%300
    B=num//60
    num=num%60
    C=num//10
    print(f'{A} {B} {C}')