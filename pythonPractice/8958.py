a=int(input())
result=[]
for i in range(a):
    str_list=input()
    ox_list=list(str_list)
    cnt=0
    total=0
    for j in range(len(ox_list)):
        if(ox_list[j]=='O'):
            total+=1
            if(j>=1 and ox_list[j-1]=='O'):
                cnt +=1
                total +=cnt
        elif(ox_list[j]=='X'):
            cnt=0
    result.append(total)
for k in range(a):
    print(result[k])

        
