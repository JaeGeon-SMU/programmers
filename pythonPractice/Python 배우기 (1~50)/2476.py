cnt=int(input())
price=[]
for i in range(cnt):
        a,b,c = map(int,input().split())
        if(a==b==c):
            price.append(a*1000+10000)
        elif(a==b or a==c):
            price.append(1000+100*a)
        elif(b==c):
            price.append(1000+100*b)
        else:
            if(a>=b and a>=c):
                price.append(100*a)
            elif(b>=c and b>=a):
                price.append(100*b)
            elif(c>=a and c>=b):
                price.append(100*c)
print(max(price))