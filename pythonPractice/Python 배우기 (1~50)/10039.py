a=[]
sum=0
for i in range(5):
    a.append(int(input()))
    if(a[i]<=40):
        a[i]=40
    sum=sum+a[i]
print(sum//5)
    

    