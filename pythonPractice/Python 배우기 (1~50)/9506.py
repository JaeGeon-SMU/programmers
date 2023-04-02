a=0
b=[]
while a!=-1:
    a=int(input())
    b.clear()
    i=1
    j=0
    total=0
    while a>i:
        if a%i==0 :
            b.append(i)
            total+=b[j]
            j+=1
        i+=1
    if(a==-1):
        break
    elif(total==a):
        b_to_str=list(map(str,b))
        print(f"{a} = "+' + '.join(b_to_str))
    else:
        print(f"{a} is NOT perfect.")
