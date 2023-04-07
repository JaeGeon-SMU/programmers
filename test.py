import math

n=976
i=1
while n>=math.pow(i,2):
    print(i,(n==math.pow(i,2)))
    if(n==math.pow(i,2)):
        answer=1
        break;
    else:
        answer=2
    i+=1
