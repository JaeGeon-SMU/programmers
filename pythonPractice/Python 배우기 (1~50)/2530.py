a,b,c = map(int,input().split())
d = int(input())

new_c=c+d
new_b=b+(new_c)//60
new_a=a+(new_b)//60

if(new_a>=24):
    new_a=new_a%24
if(new_b>=60):
    new_b=(new_b)%60
if(new_c>=60):
    new_c=(new_c)%60
print(new_a,new_b,new_c)