cnt = int(input())
cute=0
nocute=0
for i in range(cnt):
    a=int(input())
    if(a==1):
        cute=cute+1
    elif(a==0):
        nocute=nocute+1
if(cute-nocute>0):
    print("Junhee is cute!")
else:
    print("Junhee is not cute!")
    