a=list(input())
j=0
i=len(a)
while i>j:
    if(a[i-1]==a[j]):
        pellin=1
    else:
        pellin=0
        break
    i-=1
    j+=1

print(pellin)
        