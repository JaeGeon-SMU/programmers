x1,y1=map(int,input().split())
x2,y2=map(int,input().split())
x3,y3=map(int,input().split())

if(x1-x2==0):
    x4=x3
elif(x1-x3==0):
    x4=x2
elif(x2-x3==0):
    x4=x1
if(y1-y2==0):
    y4=y3
elif(y1-y3==0):
    y4=y2
elif(y2-y3==0):
    y4=y1
print(x4,y4)