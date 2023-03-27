cnt=int(input())
a=list(input())
cnt_ab=0
for i in range(cnt):
    if(a[i]=='A'):
        cnt_ab+=1
    else:
        cnt_ab-=1
 
if(cnt_ab>0):
    print('A')
elif(cnt_ab==0):
    print('Tie')
else:
    print('B')